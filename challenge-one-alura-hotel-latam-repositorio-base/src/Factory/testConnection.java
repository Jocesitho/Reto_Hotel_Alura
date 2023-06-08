package Factory;

import java.sql.Connection;
import java.sql.SQLException;

public class testConnection {
	public static void main(String[] args) throws SQLException {
	ConnectionFactory factory = new ConnectionFactory();
    Connection con = factory.recuperaConexion();

    System.out.println("abrio la conexión");
    con.close();
    System.out.println("Cerro la conexión");

	}
}
