package put;

import pojo.KullaniciModel;
import pojo.OturumModel;
import vtbaglanti.veritabani_baglanti;
import java.sql.SQLException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/put")
public class PutClass extends veritabani_baglanti {

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/KayitGuncelle")
    public boolean kayitGuncelle(OturumModel kullanici) throws ClassNotFoundException, SQLException {
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
}
