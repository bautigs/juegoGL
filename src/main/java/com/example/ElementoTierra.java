package com.example;

// Agua -> Agua = 10
// Tierra -> Agua = 20
// Fuego -> Agua = 40

    // private double dañoATierra;
    // private double dañoAAgua;
    // private double dañoAFuego;
public class ElementoTierra extends Elemento{

        public ElementoTierra(double dañoRecibidoDeAgua, double dañoRecibidoDeFuego, double dañoRecibidoDeTierra) {
            super(dañoRecibidoDeAgua, dañoRecibidoDeFuego, dañoRecibidoDeTierra);
        }

        public double dañoA(Elemento elemento){
        return elemento.recibirDañoDeTierra();
    }

        @Override
        public String toString(){
            return "elemento de tierra";
        }


    }