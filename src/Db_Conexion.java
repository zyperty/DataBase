import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*Clase DB_Conexion para crear una conexion a una base de datos MySQL*/
public class Db_Conexion {
    //	declaracion de atributos del objeto.
    private Statement statement;
    private Connection connection;
    private String jdbc;
    private String ruta;
    private String usuario;
    private String contra;
    //	Contructor de la clase ConexionMySql
    public Db_Conexion() {
        this.connection = null;
        this.statement = null;
//      Le pasamos la cadena del driver a utilizar
        this.jdbc = "com.mysql.jdbc.Driver";
//      La ruta de la DB a conectar
        this.ruta = "jdbc:mysql://localhost/universidad";
//      El Login
        this.usuario = "root";
        this.contra = "root";
    }
    //	Metodo para abrir la conexion con la DB, permite que el atributo connection cree una conexion con la DB
//	y el atributo statement cree un objeto que permita enviar sentencias sql a la DB.
    private void abrirConexion() {
        try {
//	El metodo estatico forName del la clase Class permite cargar el conector de la DB recibiendo el parametro
//  jdbc declarado en los atributos.

            Class.forName(this.jdbc);
// El metodo estatico getConnection de la clase DriverManager establece la conexion con la DB pasandole los
// parametros de la cadena de conexion.
            this.connection = DriverManager.getConnection(this.ruta, this.usuario, this.contra);
// El metodo estatico crateStatement de la clase Connection crea un statement a trevez dela conexion establecida
            this.statement = this.connection.createStatement();
// SQLException se produce si no es posible realizar una conexion
        }catch (SQLException e) {
            e.printStackTrace();
//	ClassNotFoundException se produce si no se encuentra la clase com.mysql.jdbc.Driver
        }catch(ClassNotFoundException e) {
        e.printStackTrace();
    }
    }

// Metodo desconectar investigar si es mecesario utilizarlo.

    public void desconectar() {
        this.connection = null;
    }

    //	Metodo para ejecutar sentencia sql INSERT UPDATE o DELETE.
    public String ejecutar(String sentencia) {
        try {
            this.abrirConexion();
            this.statement.executeUpdate(sentencia);
            return "op Exitosa";
        }catch(SQLException e) {
            return e.toString();
        }
//		Revisar por que no funciona el metodo consultar - No funcionaba por que el metodo estaba dentro de otro
//		fue un problema de llaves.
    }
    //	Metodo consultar ejecuta una Query y devuelve un ResultSet este se recorre con un bucle para mostrar los resultados
    public ResultSet consultar(String sentencia) {
        ResultSet resultado = null;
        try {
            this.abrirConexion();
            resultado = statement.executeQuery(sentencia);
        }catch(SQLException e) {
            e.printStackTrace();

        }
        return resultado;

    }


}
