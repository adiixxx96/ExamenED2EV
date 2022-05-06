package com.sanvalero;

public class Carta {
    private String palo;
    private String numeros;

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "palo='" + palo + '\'' +
                ", numeros='" + numeros + '\'' +
                '}';
    }

    public static int getValor(int valor) {
        return valor;
    }
}
