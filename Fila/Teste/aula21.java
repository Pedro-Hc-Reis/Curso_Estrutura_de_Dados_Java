package Fila.Teste;

import Fila.Fila;

public class aula21 {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<Integer>();

        fila.enfileira(3);
        fila.enfileira(1);
        fila.enfileira(2);

        System.out.println(fila.espiar());

        System.out.println(fila.toString());

    }

}
