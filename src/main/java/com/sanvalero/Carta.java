package com.sanvalero;

public class Carta {

    private String palos;
    private String numeros;

    public Carta(String palos, String numeros) {
        this.palos = palos;
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "palos='" + palos + '\'' +
                ", numeros='" + numeros + '\'' +
                '}';
    }

    public static int getValor(int valor) {
        return valor;
    }
}
