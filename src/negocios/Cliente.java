package negocios;

public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private int dni;
    public Cliente(String nombre, String apellido, String correo, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.dni = dni;

    }
    public Cliente(){
        nombre = "";
        apellido = "";
        correo = "";
        dni = 0;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

}
