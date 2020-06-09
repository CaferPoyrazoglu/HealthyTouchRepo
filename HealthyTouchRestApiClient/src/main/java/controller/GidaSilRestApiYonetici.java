package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.swing.JComboBox;
import model.GidaModel;
import model.GidaSilModel;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class GidaSilRestApiYonetici {

    private static final String GIDA_SIL_URL = "http://localhost:8084/HealthyTouchRest/api/delete/gidaSil";

    public Response sil(String gida) throws IOException {

        GidaSilModel gs = new GidaSilModel();
        gs.setGida(gida);

        OkHttpClient client = new OkHttpClient();

        ObjectMapper obj = new ObjectMapper();

        String json = obj.writeValueAsString(gs);

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"), json);

        Request request = new Request.Builder()
                .url(GIDA_SIL_URL)
                .delete(body)
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();

        return response;
    }

}
