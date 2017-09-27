import java.sql.ResultSet;
import java.sql.SQLException;

public class ConeccionPrueba02 {
    public static void main(String[] args){
//        Conexion a DB optmizada utilizando el objet DB_Conexion
        try {
            Db_Conexion cn = new Db_Conexion();
            String consulta = "SELECT * FROM alumno";
            ResultSet info = cn.consultar(consulta);
            while (info.next()){
                System.out.print(info.getString("nombre")+" "+ info.getString("nacionalidad")+" ");
            }
            cn.desconectar();
        }catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }
}
