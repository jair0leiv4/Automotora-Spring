package cl.jairo.proyectoAutomotora.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cl.jairo.proyectoAutomotora.model.Vehiculo;

@Repository

public class VehiculoRepository {


    private List<Vehiculo> listaVehiculos = new ArrayList<>();

    public void agregarVehiculo(Vehiculo veh) {
        listaVehiculos.add(veh);
    }

    public list<Vehiculo> listarVehiculos(){
        return listaVehiculos;
    }

    public boolean eliminarVehiculo(String patente){
        return listaVehiculos.removeIf(vehiculo -> vehiculo.getPatente().equals(patente));
    }

}
