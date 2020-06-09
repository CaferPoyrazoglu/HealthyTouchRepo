package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.CevapModel;
import model.GirisModel;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class GirisYapRestApiYonetici {

    private static final String GIRIS_URL = "http://localhost:8084/HealthyTouchRest/api/post/Giris";

    public String giris(JTextField kad_area, JPasswordField ksifre_area) throws JsonProcessingException, IOException {

        //GİRİŞ MODEL OLUŞTURULDU
        GirisModel gm = new GirisModel();
        gm.setKad(kad_area.getText());
        gm.setKsifre(ksifre_area.getText());
        
        //CEVAPMODE
        CevapModel[] cm = null;

        OkHttpClient client = new OkHttpClient();
        ObjectMapper obj = new ObjectMapper();
        String json = obj.writeValueAsString(gm);

        RequestBody body = RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"), json);
        
        Request request = new Request.Builder()
                .url(GIRIS_URL)
                .post(body)
                .build();
        
        Call call = client.newCall(request);
        
        try (Response response = client.newCall(request).execute()) {
            ObjectMapper mapper = new ObjectMapper();
            cm = mapper.readValue(response.body().bytes(), CevapModel[].class);
        }
        
        if(cm[0].getCevap().equals("true"))
            return "true";
        else
            return "false";
            
    }
}
