package Teste;

import Vetor.Lista;
import Vetor.VetorObjetos;

public class aula11 {

    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<Contato>(1);

        Contato c1 = new Contato("Contato 1", "233843566", "contato1@gmail.com");

        vetor.adiciona(c1);

    }
}
