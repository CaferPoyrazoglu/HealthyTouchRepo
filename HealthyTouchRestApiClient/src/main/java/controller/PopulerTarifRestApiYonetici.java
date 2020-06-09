package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.swing.JTextArea;
import model.GidaModel;
import model.PopulerModel;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class PopulerTarifRestApiYonetici {

    private static final String POP_URL = "http://localhost:8084/HealthyTouchRest/api/get/Populer";

    public JTextArea tarifDoldur(JTextArea tarif_area) throws IOException {

        PopulerModel[] PopulerModel = null;

        OkHttpClient httpclient = new OkHttpClient();
        Request request = new Request.Builder().url(POP_URL).get().build();

        try (Response response = httpclient.newCall(request).execute()) {
            ObjectMapper mapper = new ObjectMapper();
            PopulerModel = mapper.readValue(response.body().bytes(), PopulerModel[].class);
        }

        for (int i = 0; i < PopulerModel.length; i++) {

            tarif_area.setText(PopulerModel[i].getTarif());

        }

        return tarif_area;
    }

}
