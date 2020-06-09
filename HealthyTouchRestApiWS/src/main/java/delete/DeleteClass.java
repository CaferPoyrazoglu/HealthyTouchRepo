package delete;

import java.sql.SQLException;
import javax.ws.rs.DELETE;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import pojo.GidaSilModel;
import vtbaglanti.veritabani_baglanti;

@Path("/delete")
public class DeleteClass extends veritabani_baglanti {

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/gidaSil")
    public boolean silMethod(GidaSilModel gs) throws ClassNotFoundException, SQLException {
        baglan();

        ps = con.prepareStatement("delete from Kar99.gidalar where gida = ?");

        ps.setString(1, gs.getGida());
        ps.execute();
        return true;

    }

}
