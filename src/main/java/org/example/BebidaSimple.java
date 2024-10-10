package org.example;

public class BebidaSimple implements Bebida {
    @Override
    public String obtenerDescripcion() {
        return "Bebida simple";
    }

    @Override
    public double costo() {
        return 1.0; // Costo de la bebida simple
    }
}