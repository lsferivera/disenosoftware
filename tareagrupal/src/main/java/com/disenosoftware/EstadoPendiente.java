package com.disenosoftware;

public class EstadoPendiente implements EstadoPronostico{
    public void gestionarEstado(Pronostico pronostico){
        pronostico.estado = this;
        System.out.println("Estado cambiado a Pendiente");
    }
}
