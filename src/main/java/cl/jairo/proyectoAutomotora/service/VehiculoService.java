package cl.jairo.proyectoAutomotora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jairo.proyectoAutomotora.repository.VehiculoRepository;
import cl.jairo.proyectoAutomotora.model.Vehiculo;

@Service


public class VehiculoService {

    @Autowired
    private VehiculoRepository repo;

    public void addVehiculo(Vehiculo veh) {
        repo.agregarVehiculo(veh);
    }

    public List<Vehiculo> listarVehiculos(){
        return repo.listarVehiculos();
    }

    public boolean deleteVehiculo(String patente){
        return repo.eliminarVehiculo(patente);
    }



    
}
