package com.example;

import java.util.List;
import java.util.Random;

public class IAAleatoria implements TipoIA{

    public Carta seleccionarCarta(Carta cartaActivaDelRival, List<Carta> cartasDisponibles){
        System.out.println("La IA está eligiendo una carta ...");
        Random random = new Random();
        return cartasDisponibles.get(random.nextInt(cartasDisponibles.size()));
    }
}
