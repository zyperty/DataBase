import java.util.Date;

public class Alumno {

    private String nombre;
    private Long Documento;
    private Date FechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDocumento() {
        return Documento;
    }

    public void setDocumento(Long documento) {
        Documento = documento;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
}
