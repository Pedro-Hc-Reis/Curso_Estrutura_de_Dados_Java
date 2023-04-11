package Lista.Teste;

import Lista.ListaEncadeada;

public class ListaEncadeadaTEste {

    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();
        lista.adiciona(1);

        System.out.println("Tamanho = " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona(2);
        System.out.println(lista);

        lista.adiciona(3);
        System.out.println(lista);

        lista.limpa();
        System.out.println(lista);

    }
}
