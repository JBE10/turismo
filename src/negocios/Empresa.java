package negocios;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Ubicacion> ListaUbicaciones;
    public Empresa() {
        ListaUbicaciones = new ArrayList<>();
    }
    public ArrayList<Ubicacion> getListaUbicaciones() {
        return ListaUbicaciones;
    }
    public void agregarUbicacion(Ubicacion ubicacion) {
        for(Ubicacion u : ListaUbicaciones) {
            if (u.equals(ubicacion)) {
                System.out.println("La ubicacion fue cargada previamente");
                return;

            }
        }
        ListaUbicaciones.add(ubicacion);
        System.out.println("La ubicacion fue agregada correctamente");
    }
}
