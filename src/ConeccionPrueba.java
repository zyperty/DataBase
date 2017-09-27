

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConeccionPrueba {
    public static void main(String[] argumentos) {

        Connection conexion = null;
        try {
            String jdbc = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/universidad";
            String user = "root";
            String pass = "root";
            Statement statement = null;
            ResultSet resultado = null;

            conexion = DriverManager.getConnection(url, user, pass);
            statement = conexion.createStatement();
            if (conexion != null) {
                System.out.println("La conexion se realizo con exito!");
                resultado = statement.executeQuery("SELECT * FROM alumno");
                while (resultado.next()) {
                    System.out.print(resultado.getString("nombre")+" "+ resultado.getString("nacionalidad")+" ");
                    System.out.print(resultado.getString("matricula")+" "+resultado.getString("direccion")+" ");
                }

                conexion.close();
            }

        }catch(SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }
}
