package cl.jairo.proyectoAutomotora.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Vehiculo {
    private String patente;
    private String modelo;
    private int anio;
}
