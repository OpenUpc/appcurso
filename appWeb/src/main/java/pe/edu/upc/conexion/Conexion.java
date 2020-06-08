package pe.edu.upc.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	protected static Connection oCn;

	public static Connection AbrirConexion() {
		if (oCn != null) {
			return oCn;
		}
		try {
			String usuario = "root";
			String password = "root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			// jdbc:postgresql://localhost/test?ssl=true
			// oCn =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/appweb?useSSL=false&serverTimezone=UTC",

			oCn = DriverManager.getConnection("jdbc:mysql://localhost:3306/appweb?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
					usuario, password);
			System.out.println("conexion exitosa");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("error al conectar");
		}
		return oCn;
	}

	public static void CerrarConexion() {
		try {
			if (oCn != null) {
				oCn.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
