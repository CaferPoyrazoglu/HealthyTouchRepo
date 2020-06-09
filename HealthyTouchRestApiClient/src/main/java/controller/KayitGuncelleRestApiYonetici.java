package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.OturumModel;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class KayitGuncelleRestApiYonetici {

    private static final String UPDATE_URL = "http://localhost:8084/HealthyTouchRest/api/put/KayitGuncelle";

    public void guncelle(OturumModel kullanici) throws IOException {

        OkHttpClient client = new OkHttpClient();

        ObjectMapper obj = new ObjectMapper();

        String json = obj.writeValueAsString(kullanici);

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"), json);

        Request request = new Request.Builder()
                .url(UPDATE_URL)
                .put(body)
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();

        JOptionPane.showMessageDialog(null, kullanici.getAd().toUpperCase() + " Güncellendi.");

    }
}
