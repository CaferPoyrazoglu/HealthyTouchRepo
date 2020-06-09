package post;

import pojo.CevapModel;
import pojo.GidaBilgiModel;
import pojo.GidaEkleModel;
import pojo.GirisModel;
import pojo.KullaniciModel;
import pojo.OturumModel;
import vtbaglanti.veritabani_baglanti;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/post")
public class PostClass extends veritabani_baglanti {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/Kayit")
    public boolean kayitMethod(KullaniciModel kullanici) throws Exception {
        baglan();

        ps = con.prepareStatement("insert into Kar99.kullanicilar (kad,ksifre,ad,soyad,yas,boy,kilo,cinsiyet,kilotercih) values (?,?,?,?,?,?,?,?,?)");

        ps.setString(1, kullanici.getKad());
        ps.setString(2, kullanici.getKsifre());
        ps.setString(3, kullanici.getAd());
        ps.setString(4, kullanici.getSoyad());
        ps.setString(5, kullanici.getYas());
        ps.setString(6, kullanici.getBoy());
        ps.setString(7, kullanici.getKilo());
        ps.setString(8, kullanici.getCinsiyet());
        ps.setString(9, kullanici.getKilotercih());

        ps.execute();

        return true;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/GidaSec")
    public List<GidaBilgiModel> gidaSecMethod(String gelenGida) throws Exception {
        baglan();

        List<GidaBilgiModel> GidaBilgiModelList = new ArrayList<>();

        float karbonhidrat = 0;
        float yag = 0;
        float protein = 0;
        String alerjen = "";

        GidaBilgiModel gbm = new GidaBilgiModel();

        ps = con.prepareStatement("select * from Kar99.gidalar where gida = ?");
        ps.setString(1, gelenGida);
        rs = ps.executeQuery();
        while (rs.next()) {
            karbonhidrat = karbonhidrat + rs.getFloat("karbonhidrat");
            yag = yag + rs.getFloat("yag");
            protein = protein + rs.getFloat("protein");
            alerjen = alerjen + rs.getString("alerjen") + " ";
        }

        gbm.setKarbonhidrat(karbonhidrat);
        gbm.setYag(yag);
        gbm.setProtein(protein);
        gbm.setAlerjen(alerjen);

        GidaBilgiModelList.add(gbm);

        return GidaBilgiModelList;
    }

    //PROJEDE DAHA KULLANILMIYOR AMA METHOD SIKINTISIZ CALISIYOR
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/KayitGuncelle")
    public boolean kayitGuncelleMethod(KullaniciModel kullanici) throws Exception {
        baglan();

        ps = con.prepareStatement("update Kar99.kullanicilar set kad = ?,ksifre = ?,ad = ?,soyad = ?,yas = ?,boy = ?,kilo = ?,cinsiyet = ?,kilotercih = ? where kad = ?");

        ps.setString(1, kullanici.getKad());
        ps.setString(2, kullanici.getKsifre());
        ps.setString(3, kullanici.getAd());
        ps.setString(4, kullanici.getSoyad());
        ps.setString(5, kullanici.getYas());
        ps.setString(6, kullanici.getBoy());
        ps.setString(7, kullanici.getKilo());
        ps.setString(8, kullanici.getCinsiyet());
        ps.setString(9, kullanici.getKilotercih());
        ps.setString(10, kullanici.getKad());

        ps.execute();

        return true;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/Giris")
    public List<CevapModel> girisMethod(GirisModel girisModel) throws Exception {
        baglan();

        List<CevapModel> CevapModelList = new ArrayList<>();

        CevapModel cm = new CevapModel();

        ps = con.prepareStatement("select * from Kar99.kullanicilar where kad = ?");
        ps.setString(1, girisModel.getKad());
        rs = ps.executeQuery();
        String sifre = "";
        while (rs.next()) {
            sifre = rs.getString("ksifre");
        }

        if (sifre.equals(girisModel.getKsifre())) {
            cm.setCevap("true");
            CevapModelList.add(cm);
            return CevapModelList;
        } else {
            cm.setCevap("false");
            CevapModelList.add(cm);
            return CevapModelList;
        }

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/Oturum")
    public List<OturumModel> oturumMethod(GirisModel girisModel) throws Exception {
        baglan();

        List<OturumModel> OturumModelList = new ArrayList<>();

        OturumModel om = new OturumModel();

        ps = con.prepareStatement("select * from Kar99.kullanicilar where kad = ?");
        ps.setString(1, girisModel.getKad());
        rs = ps.executeQuery();
        while (rs.next()) {
            om.setKad(rs.getString("kad"));
            om.setKsifre(rs.getString("ksifre"));
            om.setAd(rs.getString("ad"));
            om.setSoyad(rs.getString("soyad"));
            om.setYas(rs.getString("yas"));
            om.setBoy(rs.getString("boy"));
            om.setKilo(rs.getString("kilo"));
            om.setCinsiyet(rs.getString("cinsiyet"));
            om.setKilotercih(rs.getString("kilotercih"));
            om.setNo(rs.getString("no"));
        }

        OturumModelList.add(om);
        return OturumModelList;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/MalzemeEkle")
    public boolean MalzemeMethod(GidaEkleModel gem) throws Exception {
        baglan();

        ps = con.prepareStatement("insert into Kar99.gidalar (gida,karbonhidrat,protein,yag,alerjen) values (?,?,?,?,?)");

        String karb = String.valueOf(gem.getKarbonhidrat());
        String prot = String.valueOf(gem.getProtein());
        String yag = String.valueOf(gem.getYag());

        ps.setString(1, gem.getGida());
        ps.setString(2, karb);
        ps.setString(3, prot);
        ps.setString(4, yag);
        ps.setString(5, gem.getAlerjen());

        ps.execute();

        return true;
    }

}
