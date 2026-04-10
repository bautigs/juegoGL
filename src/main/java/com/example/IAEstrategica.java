package com.example;

import java.util.Comparator;
import java.util.List;

public class IAEstrategica implements TipoIA{
        public Carta seleccionarCarta(Carta cartaActivaDelRival, List<Carta> cartasDisponibles){
            return cartasDisponibles
                                    .stream()
                                    .max(Comparator.comparingDouble(carta -> deltaDeDaño(cartaActivaDelRival, carta)))
                                    .orElse(null); 
        }

        public Double deltaDeDaño(Carta cartaActivaDelRival, Carta cartaDeLaIA){
            Double dañoRealizado = cartaDeLaIA.getElemento().dañoA(cartaActivaDelRival.getElemento());
            Double dañoRecibido = cartaDeLaIA.getElemento().dañoA(cartaActivaDelRival.getElemento());

            return dañoRealizado - dañoRecibido; 
        }
}
