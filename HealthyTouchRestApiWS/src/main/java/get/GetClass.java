package get;

import pojo.GidaModel;
import pojo.OrnekOgunModel;
import pojo.PopulerModel;
import vtbaglanti.veritabani_baglanti;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/get")
public class GetClass extends veritabani_baglanti {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/GidaList")
    public List<GidaModel> getGidaList() throws SQLException, ClassNotFoundException {

        baglan();

        List<GidaModel> GidaModelList = new ArrayList<>();

        int gidano;
        String gida;
        double karbonhidrat;
        double protein;
        double yag;
        String alerjen;

        rs = stmt.executeQuery("select * from Kar99.gidalar");

        while (rs.next()) {
            GidaModel gm = new GidaModel();

            gidano = rs.getInt("gidano");
            gida = rs.getString("gida");
            karbonhidrat = rs.getDouble("karbonhidrat");
            protein = rs.getDouble("protein");
            yag = rs.getDouble("yag");
            alerjen = rs.getString("alerjen");

            gm.setGidano(gidano);
            gm.setGida(gida);
            gm.setKarbonhidrat(karbonhidrat);
            gm.setProtein(protein);
            gm.setYag(yag);
            gm.setAlerjen(alerjen);

            GidaModelList.add(gm);

        }

        return GidaModelList;

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/OrnekOgun")
    public List<OrnekOgunModel> getOrnekOgun() throws ClassNotFoundException, SQLException {

        baglan();
        List<OrnekOgunModel> OrnekOgunModelList = new ArrayList<>();
        int no;
        String ad;
        String ogun;
        String malzeme;

        rs = stmt.executeQuery("select * from Kar99.ornek");

        while (rs.next()) {
            OrnekOgunModel om = new OrnekOgunModel();

            no = rs.getInt("no");
            ad = rs.getString("ad");
            ogun = rs.getString("ogun");
            malzeme = rs.getString("malzemeler");

            om.setNo(no);
            om.setAd(ad);
            om.setOgun(ogun);
            om.setMalzemeler(malzeme);

            OrnekOgunModelList.add(om);

        }

        return OrnekOgunModelList;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/Populer")
    public List<PopulerModel> populerMethod() throws ClassNotFoundException, SQLException {

        baglan();
        List<PopulerModel> PopulerModelList = new ArrayList<>();

        String tarif;

        rs = stmt.executeQuery("select tarif from Kar99.populer");

        while (rs.next()) {
            PopulerModel pm = new PopulerModel();

            tarif = rs.getString("tarif");

            pm.setTarif(tarif);

            PopulerModelList.add(pm);

        }

        return PopulerModelList;
    }

}
