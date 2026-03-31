package cl.jairo.proyectoAutomotora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController



public class VehiculoController {   

    @Autowired
    private VehiculoService service;

    @GetMapping("/api/v1/vehiculos")
    
    public List<Vehiculo> mostrarVehiculos(){
        return service.getVehiculos();
    }
    
    @PostMapping("/api/v1/vehiculos")

    public void agregarNuevo(Vehiculo vehiculo){
        service.addVehiculo(vehiculo);
    }
    
    @DeleteMapping("/api/v1/vehiculos"){
        public boolean eliminar(String patente){
            return service.deleteVehiculo(patente);
        }
    }





}
