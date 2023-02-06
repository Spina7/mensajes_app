import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        try(Connection cnx = con.getConnection()) {
            System.out.println("Conexion exitosa");

            System.out.println("Cerrando conexion");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
