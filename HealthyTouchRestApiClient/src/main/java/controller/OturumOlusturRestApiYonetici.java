package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.GirisModel;
import model.OturumModel;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OturumOlusturRestApiYonetici {

    private static final String OTURUM_URL = "http://localhost:8084/HealthyTouchRest/api/post/Oturum";

    public OturumModel[] olustur(String kad) throws Exception {

        OturumModel[] om = null;

        GirisModel gm = new GirisModel();
        gm.setKad(kad);
        gm.setKsifre("1");

        OkHttpClient client = new OkHttpClient();

        ObjectMapper obj = new ObjectMapper();

        String json = obj.writeValueAsString(gm);

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"), json);

        Request request = new Request.Builder()
                .url(OTURUM_URL)
                .post(body)
                .build();

        Call call = client.newCall(request);

        try (Response response = client.newCall(request).execute()) {
            ObjectMapper mapper = new ObjectMapper();
            om = mapper.readValue(response.body().bytes(), OturumModel[].class);
        }

        return om;
    }

}
