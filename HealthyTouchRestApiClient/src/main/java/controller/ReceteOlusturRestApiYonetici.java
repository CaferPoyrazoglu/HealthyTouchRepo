package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import model.GidaBilgiModel;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ReceteOlusturRestApiYonetici {

    private static final String GIDA_SEC_URL = "http://localhost:8084/HealthyTouchRest/api/post/GidaSec";

    public GidaBilgiModel[] degerGetir(String gida) throws IOException {

        GidaBilgiModel[] gbm = null;

        OkHttpClient client = new OkHttpClient();

        String json = gida;

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"), json);

        Request request = new Request.Builder()
                .url(GIDA_SEC_URL)
                .post(body)
                .build();

        Call call = client.newCall(request);

        try (Response response = client.newCall(request).execute()) {
            ObjectMapper mapper = new ObjectMapper();
            gbm = mapper.readValue(response.body().bytes(), GidaBilgiModel[].class);
        }

        return gbm;
    }
}
