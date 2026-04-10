package com.example;
import java.util.*;

public class Jugador extends Participante{

    Scanner scanner; 

    public Jugador(String nombre) {
        super(nombre);
        scanner = new Scanner(System.in);
    }

    public Carta seleccionarCarta(Carta cartaActivaDelRival){
        System.out.println("Seleccionar Carta");
        if(!(cartaActivaDelRival == null)){
            System.out.println("La carta activa del oponente es: " + cartaActivaDelRival.toString());
        }

        this.mostrarCartas();

        int elegida = scanner.nextInt();

        this.cartaActiva = this.mano.get(elegida);

        return this.cartaActiva;
    }

    public void cerrarScanner(){
        scanner.close();
    }

}