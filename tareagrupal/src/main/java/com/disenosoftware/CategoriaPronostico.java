package com.disenosoftware;

public class CategoriaPronostico {
    String nombre;
    String descripcion;

    public boolean validarPronostico(Pronostico pronostico){
        return pronostico != null && pronostico.prediccion != null && !pronostico.prediccion.isEmpty();
    }

}
