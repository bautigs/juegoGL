package com.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
public abstract class Participante{

    protected String nombre;
    protected List<Carta> mano;
    protected Carta cartaActiva;

    public Participante(String nombre){
        this.nombre=nombre;
        this.mano = new ArrayList<>();
    }

    public void recibirCartas(List<Carta> cartas){
        this.mano = cartas;
    }

    public abstract Carta seleccionarCarta(Carta cartaActivaDelRival);

    public Carta getCartaActiva(){
        return this.cartaActiva;
    }

    public void eliminarCarta(Carta carta){
        this.mano.remove(carta);
    }

    public boolean sinCartasVivas(){
        return this.mano.size() == 0;
    }

    public void mostrarCartas(){
        for(int i = 0; i < this.mano.size(); i++){
            System.out.println(i + ". " + this.mano.get(i).toString());
        }

    }
}
