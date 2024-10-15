package negocios;

import java.util.ArrayList;

public class Ubicacion {
    private String provincia;
    private String localidad;
    private double kilometro;
    private ArrayList<Alojamiento> alojamientos;
    public Ubicacion(String provincia, String localidad, double kilometro) {
        this.provincia = provincia;
        this.localidad = localidad;
        this.kilometro = kilometro;
        this.alojamientos =new ArrayList<>();
    }
    public Ubicacion(){
        provincia=null;
        localidad=null;
        kilometro=0.0;
        alojamientos=new ArrayList<>();
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public double getKilometro() {
        return kilometro;

    }
    public void setKilometro(double kilometro) {
        this.kilometro = kilometro;

    }
    public ArrayList<Alojamiento> getAlojamientos() {
        return alojamientos;
    }
    public void agregarAlojamiento(Alojamiento alojamiento) {
        for(Alojamiento a: alojamientos){
            if (a.equals(alojamiento)){
                System.out.println("El alogamiento ya existe");
                return;
            }
        }
        alojamientos.add(alojamiento);
        System.out.println("El alojaminto fue agregado correctamente");

    }


}
