package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.GidaModel;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TumGidalarRestApiYonetici {

    private static final String GIDA_LISTE_URL = "http://localhost:8084/HealthyTouchRest/api/get/GidaList";

    public DefaultTableModel tabloDoldur() throws IOException {

        GidaModel[] GidaModel = null;
        OkHttpClient httpclient = new OkHttpClient();
        Request request = new Request.Builder().url(GIDA_LISTE_URL).get().build();

        try (Response response = httpclient.newCall(request).execute()) {
            ObjectMapper mapper = new ObjectMapper();
            GidaModel = mapper.readValue(response.body().bytes(), GidaModel[].class);
        }

        DefaultTableModel dtm = new DefaultTableModel();

        dtm.setColumnIdentifiers(new Object[]{"Gida", "Karbonhidrat", "Protein", "Yag" , "Alerjen"});

        for (int i = 0; i < GidaModel.length; i++) {

            String data1 = GidaModel[i].getGida();
            double data2 = GidaModel[i].getKarbonhidrat();
            double data3 = GidaModel[i].getProtein();
            double data4 = GidaModel[i].getYag();
            String data5 = GidaModel[i].getAlerjen();

            Object[] row1 = {data1, String.valueOf(data2), String.valueOf(data3), String.valueOf(data4), data5};
            dtm.addRow(row1);
        }

        return dtm;
    }

}
