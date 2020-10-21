import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class conecta {

	private static String db = "base_peliculas";
	private static String login = "root";
	private static String password = "0123456789";
	private static String url_ = "jdbc:mysql://127.0.0.1:3306/base_peliculas?useSSL=false&useTimeZone=true&serverTimezone=UTC&allowpPublicKeyRetrieval=true";

	private static Connection connection_;
	private static Statement st_ = null;

	public conecta() {

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

		conecta conexion = new conecta();
		String query = "select * from peliculas;";
		try {
			Statement stmt = connection_.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString("nom_pelicula"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
