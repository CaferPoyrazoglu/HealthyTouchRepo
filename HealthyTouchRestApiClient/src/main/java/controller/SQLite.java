package controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class SQLite {

    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement ps;

    public SQLite() {

        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:gunluk.db");
            stmt = con.createStatement();
            String sql = "CREATE TABLE if not exists GUNLUK "
                    + "(NO INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + " BAS  CHAR(50)    NOT NULL, "
                    + " MTN  CHAR(50)     NOT NULL)";
            stmt.executeUpdate(sql);
            System.out.println("Veritabanı Oluşturma Başarılı");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLite.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void listele(JComboBox<String> gunlukCombo) {
        try {
            gunlukCombo.removeAllItems();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from GUNLUK");
            while (rs.next()) {
                //System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
                gunlukCombo.addItem(rs.getString(2));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void ekle(String baslik, String metin) {

        try {
            Statement stmt = con.createStatement();
            ps = con.prepareStatement("insert into GUNLUK (BAS,MTN) values (?,?)");
            ps.setString(1, baslik);
            ps.setString(2, metin);
            ps.execute();
            System.out.println("Kayıt Eklendi");

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public String goster(String mtn) throws SQLException {

        Statement stmt = con.createStatement();
        ps = con.prepareStatement("select MTN from GUNLUK where BAS = ?");
        ps.setString(1, mtn);

        ResultSet rs = ps.executeQuery();
        String mtn2 = null;
        while (rs.next()) {
            mtn2 = rs.getString(1);
        }
        return mtn2;
    }

}
