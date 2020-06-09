package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.swing.JComboBox;
import model.GidaModel;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GidaListeleRestApiYonetici {

    private static final String GIDA_LISTE_URL = "http://localhost:8084/HealthyTouchRest/api/get/GidaList";

    public JComboBox<String> comboboxEkle(JComboBox<String> gida_combobox) throws IOException {

        GidaModel[] GidaModel = null;
        OkHttpClient httpclient = new OkHttpClient();
        Request request = new Request.Builder().url(GIDA_LISTE_URL).get().build();

        try (Response response = httpclient.newCall(request).execute()) {
            ObjectMapper mapper = new ObjectMapper();
            GidaModel = mapper.readValue(response.body().bytes(), GidaModel[].class);
        }

        for (int i = 0; i < GidaModel.length; i++) {
            gida_combobox.addItem(GidaModel[i].getGida());
        }

        return gida_combobox;
    }

}
