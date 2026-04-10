package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Juego {

    private List<Elemento> elementosDisponibles;
    private final int cartasPorJugador;
    private Jugador jugador;
    private InteligenciaArtificial ia;
    private boolean juegoActivo;

    public Juego(int cartasPorJugador, List<Elemento> elementosDisponibles, Jugador jugador, InteligenciaArtificial ia) {
        this.elementosDisponibles = elementosDisponibles;
        this.juegoActivo = true;
        this.cartasPorJugador = cartasPorJugador;
        this.jugador = jugador;
        this.ia = ia;
    }

    public Jugador getJugador1() {
        return jugador;
    }


    public void mostrarEstadoPartida(){
        System.out.println("Tus cartas son: ");
        jugador.mostrarCartas();
        System.out.println("\n Las cartas de la ia son: ");
        ia.mostrarCartas();
        System.out.println();

    }

    public void jugar(){

        this.jugador.recibirCartas(this.repartirCartas());
        this.ia.recibirCartas(this.repartirCartas());

        this.mostrarEstadoPartida();

        Carta cartaJugador = this.jugador.seleccionarCarta(null);
        Carta cartaIA = this.ia.seleccionarCarta(cartaJugador);


        while(juegoActivo){

            System.out.println("La carta seleccionada por la IA fue: " + cartaIA.toString());

            double dañoJugadorAIA = cartaJugador.atacarA(cartaIA);

            System.out.println("El ataque del jugador infligió un daño de: " + dañoJugadorAIA);

            double vidaCartaIA = cartaIA.getVida();

            System.out.println("La vida restante de la carta de la IA es: " + cartaIA.getVida());

            if(vidaCartaIA == 0) {
                System.out.println("La carta de la IA ha sido vencida!");
                ia.eliminarCarta(cartaIA);

                if (ia.sinCartasVivas()) {
                    System.out.println("La IA no tiene más cartas con vida. El juego termina. El jugador " + this.jugador.getNombre() + " gana.");
                    juegoActivo = false;
                    break;
                }

                ia.seleccionarCarta(cartaJugador);
                cartaIA = this.ia.getCartaActiva();
            }


            double dañoIAaJugador = cartaIA.atacarA(cartaJugador);

            System.out.println("El ataque de la IA infligió un daño de: " + dañoIAaJugador);

            double vidaCartaJugador = cartaJugador.getVida();

            System.out.println("La vida restante de la carta del jugador es: " + cartaJugador.getVida());

            if(vidaCartaJugador == 0){
                System.out.println("La carta del jugador ha sido vencida!");
                jugador.eliminarCarta(cartaJugador);


                if(jugador.sinCartasVivas()){
                    System.out.println("El jugador no tiene más cartas con vida. El juego termina. La IA gana.");
                    juegoActivo = false;
                    break;
                }

                jugador.seleccionarCarta(cartaIA);
                cartaJugador = this.jugador.getCartaActiva();

            }

            System.out.println();
            System.out.println("El turno ha finalizado y el estado de la partida es el siguiente: ");
            this.mostrarEstadoPartida();

            cartaJugador = this.jugador.getCartaActiva();
            cartaIA = this.ia.getCartaActiva();

        }

    }

    public List<Carta> repartirCartas(){

        Random random = new Random();
        List<Carta> cartas = new ArrayList<>();

        for(int i = 0; i < this.cartasPorJugador; i++){
            int randomIndex = random.nextInt(this.elementosDisponibles.size());
            cartas.add(new Carta(this.elementosDisponibles.get(randomIndex)));
        }

        return cartas;
    }


}
        
