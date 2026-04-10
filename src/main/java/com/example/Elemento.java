package com.example;

import lombok.Getter;

// private double dañoATierra;
    // private double dañoAAgua;
    // private double dañoAFuego;
@Getter
public abstract class Elemento {


    private double dañoRecibidoDeAgua;

    private double dañoRecibidoDeFuego;

    private double dañoRecibidoDeTierra;

    public Elemento(double dañoRecibidoDeAgua, double dañoRecibidoDeFuego, double dañoRecibidoDeTierra) {

        this.dañoRecibidoDeAgua = dañoRecibidoDeAgua;
        this.dañoRecibidoDeFuego = dañoRecibidoDeFuego;
        this.dañoRecibidoDeTierra = dañoRecibidoDeTierra;
    }

    public abstract double dañoA(Elemento elemento);
    public double recibirDañoDeAgua(){
        return this.dañoRecibidoDeAgua;
    }
    public double recibirDañoDeTierra(){
        return this.dañoRecibidoDeTierra;
    }
    public double recibirDañoDeFuego(){
        return this.dañoRecibidoDeFuego;
    }

    
}