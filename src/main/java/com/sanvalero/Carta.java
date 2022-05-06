package com.sanvalero;

public class Carta {
    private String palo;
    private String numeros;

    public Carta(String palo, String numeros) {
        this.palo = palo;
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "palo='" + palo + '\'' +
                ", numero='" + numeros + '\'' +
                '}';
    }

    public static int getValor(int valor) {
        return valor;
    }
}
