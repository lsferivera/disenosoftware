package com.disenosoftware;

import java.util.Date;
import java.util.List;

public class Evento {
    String nombre;
    Date fechaInicio;
    List<Equipo> equipos;
    List<Estadistica> estadisticas;
    List<Pronostico> pronosticos;

    public void mostrarEstadistica(){
        for (Estadistica estadistica : estadisticas){
            System.out.println(estadistica.descripcion + ": " + estadistica.valor);
        }
    }
    public void cerrarApuestas(){
        System.out.println("Apuestas cerradas");
    }
}
