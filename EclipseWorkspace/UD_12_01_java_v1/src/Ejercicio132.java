import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Ejercicio132 {

	private static String db = "Ciclistas_DB";
	private static String login = "admin";
	private static String password = "Su4r3zp4!";
	private static String url_ = "jdbc:mysql://127.0.0.1:3306/" + db;

	private static Connection connection_;
	private static Statement st_ = null;

	public Ejercicio132() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection_ = DriverManager.getConnection(url_, login, password);
			if (connection_ != null) {
				st_ = connection_.createStatement();
				System.out.println("Conexión correcta");
			} else {
				System.out.println("Conexión fallida");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Ejercicio132 conexion = new Ejercicio132();
		String query = "select * from maillot;";
		try {
			Statement stmt = connection_.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("COD     " + "TIPO            " + "COLOR           " + "PREMIO");
			System.out.println("-------------------------------------------------------------");

			while (rs.next()) {
				System.out.printf(rs.getString("codigo") + "\t");
				System.out.printf(rs.getString("tipo") + "\t\t");
				System.out.printf(rs.getString("color") + "\t");
				System.out.printf(rs.getString("premio"));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
