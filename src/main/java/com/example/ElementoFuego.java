package com.example;

// Agua -> Fuego = 40
// Tierra -> Fuego = 20
// Fuego -> Fuego = 10

    // private double dañoATierra;
    // private double dañoAAgua;
    // private double dañoAFuego;
public class ElementoFuego extends Elemento{
    public ElementoFuego(double dañoRecibidoDeAgua, double dañoRecibidoDeFuego, double dañoRecibidoDeTierra) {
        super(dañoRecibidoDeAgua, dañoRecibidoDeFuego, dañoRecibidoDeTierra);
    }

    public double dañoA(Elemento elemento){
        return elemento.recibirDañoDeFuego();
    }

        @Override
        public String toString(){
            return "elemento de fuego";
        }

    }