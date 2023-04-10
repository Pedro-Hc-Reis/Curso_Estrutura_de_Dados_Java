package Vetor.Exercicios;

import Vetor.Lista;

public class ex04 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista.obtem(0));
        System.out.println(lista.obtem(2));
        System.out.println(lista.obtem(4));
    }
}
