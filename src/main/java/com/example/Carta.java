package com.example;

public class Carta {
    private final Elemento miElemento;
    private Double vida;

    public Carta(Elemento elemento){
        this.miElemento = elemento;
        this.vida = 100.0;
    }

    public double atacarA(Carta otraCarta){
        double dañoInfligido = this.miElemento.dañoA(otraCarta.getElemento());
        otraCarta.recibirDaño(dañoInfligido);
        return dañoInfligido;
    }

    public void recibirDaño(double daño){
        this.vida = Math.max(0.0,vida - daño);
    }

    public Double getVida(){
        return this.vida;
    }

    public Elemento getElemento(){
        return this.miElemento;
    }

    public boolean estaMuerta(){
        return this.vida==0.0;
    }
    @Override 
    public String toString(){
        return "Soy una carta de " + this.miElemento.toString() + " y mi vida es: " + this.vida;
    }
}
