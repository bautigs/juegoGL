package com.example;


public class InteligenciaArtificial extends Participante{

    private TipoIA tipoIA;

    public InteligenciaArtificial(TipoIA tipoIA) {
        super("ia");
        this.tipoIA = tipoIA;
    }

    public Carta seleccionarCarta(Carta cartaActivaDelRival){
        this.cartaActiva = this.tipoIA.seleccionarCarta(cartaActivaDelRival,this.mano);
        return this.cartaActiva;
    }

}
