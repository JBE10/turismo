package negocios;

import java.util.ArrayList;

public class Alojamiento {
    private final  int hotel=0;
    private final  int hospedaje=1;
    private final  int cabana=2;
    private final  int motel=3;
    private String nombre;
    private Ubicacion ubicacion;
    private int tipoAlojamiento;
    private ArrayList<Cliente> listaCliente;
    public Alojamiento(String nombre, Ubicacion ubicacion, int tipoAlojamiento) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipoAlojamiento = tipoAlojamiento;
        this.listaCliente = new ArrayList<>();

    }
    public Alojamiento(){
        nombre = "";
        ubicacion =null;
        tipoAlojamiento = -1;
        listaCliente = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Ubicacion getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    public int getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(int tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }
    public void agregarCliente(Cliente cliente){
        for(Cliente c: listaCliente){
            if(c.getDni()==cliente.getDni()){
                System.out.println("El cliente ya tiene una reserva");
                return;
            }
        }
        listaCliente.add(cliente);
        System.out.println("Reserva cargada correctamente");

    }


}
