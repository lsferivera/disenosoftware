package com.disenosoftware;

public class EstadoAcertado implements EstadoPronostico{
    public void gestionarEstado(Pronostico pronostico){
        pronostico.estado = this;
        System.out.println("Estado cambiado a Acertado");
    }
}
