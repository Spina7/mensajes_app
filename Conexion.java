import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://54.219.28.243:32770/mensajes_app", "root", "phoenixKz7294");
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
