package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.swing.DefaultListModel;
import model.OrnekOgunModel;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OrnekOgunRestApiYonetici {

    private static final String ORNEK_OGUN_URL = "http://localhost:8084/HealthyTouchRest/api/get/OrnekOgun";

    public DefaultListModel listele(DefaultListModel dm) throws IOException {

        OrnekOgunModel[] OrnekOgunModel = null;
        OkHttpClient httpclient = new OkHttpClient();
        Request request = new Request.Builder().url(ORNEK_OGUN_URL).get().build();

        try (Response response = httpclient.newCall(request).execute()) {
            ObjectMapper mapper = new ObjectMapper();
            OrnekOgunModel = mapper.readValue(response.body().bytes(), OrnekOgunModel[].class);
        }

        for (int i = 0; i < OrnekOgunModel.length; i++) {

            dm.addElement(OrnekOgunModel[i].getAd());
            dm.addElement(OrnekOgunModel[i].getOgun());
            dm.addElement(OrnekOgunModel[i].getMalzemeler());

        }

        return dm;
    }

}
