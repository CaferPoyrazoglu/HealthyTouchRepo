package vtbaglanti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class veritabani_baglanti {

    public Connection con;
    public Statement stmt;
    public ResultSet rs;
    public PreparedStatement ps;

    public void baglan() throws ClassNotFoundException, SQLException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=kar99", "evected", "123456");
        stmt = con.createStatement();
        
    }
    
}
