package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        Jugador jugador = new Jugador("Matias");
        InteligenciaArtificial ia = new InteligenciaArtificial(new IAAleatoria());

        List<Elemento> elementosDisponibles = new ArrayList<>();

        elementosDisponibles.add(new ElementoAgua(5,30,20));
        elementosDisponibles.add(new ElementoTierra(20,15,5));
        elementosDisponibles.add(new ElementoFuego(30,5,10));

        Juego juego = new Juego(5,elementosDisponibles,jugador,ia);
        juego.jugar();
    }
}
