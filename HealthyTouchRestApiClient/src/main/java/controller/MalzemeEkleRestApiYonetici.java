package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.GidaEkleModel;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MalzemeEkleRestApiYonetici {

    private static final String MALZEME_EKLE_URL = "http://localhost:8084/HealthyTouchRest/api/post/MalzemeEkle";

    public void ekle(GidaEkleModel gem) throws IOException {

        OkHttpClient client = new OkHttpClient();

        ObjectMapper obj = new ObjectMapper();

        String json = obj.writeValueAsString(gem);

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"), json);

        Request request = new Request.Builder()
                .url(MALZEME_EKLE_URL)
                .post(body)
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();

        //JOptionPane.showMessageDialog(null, kullanici.getAd().toUpperCase() + " Başarıyla kayıt oldunuz.");

    }
}
