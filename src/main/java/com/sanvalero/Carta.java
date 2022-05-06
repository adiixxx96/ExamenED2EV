package com.sanvalero;

public class Carta {
    private String palos;
    private String numero;

    public Carta(String palos, String numero) {
        this.palos = palos;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "palo='" + palos + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

    public static int getValor(int valor) {
        return valor;
    }
}
