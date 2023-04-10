package Pilha.Exercicios;

import Pilha.Pilha;

public class ex03 {

    public static void main(String[] args) {

        Pilha<Livro> pilha = new Pilha<Livro>(20);

        Livro livro;

        System.out.println("Pilha de livros criada, pilha está está vazia? " + pilha.estaVazia());

        System.out.println("Empilhando livros na pilha");

        for(int i = 1 ; i <= 4 ; i++){

            livro = new Livro();
            livro.setNome("Livro " + i);
            livro.setAutor("Autor " + i);
            livro.setIsbn("12345"+i);
            livro.setAnoLancamento(2020+i);

            pilha.empilha(livro);
        }

        System.out.println(pilha.tamanho() + " livros foram empilhados: ");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está está vazia? " + pilha.estaVazia());

        System.out.println("Espiando o topo da pilha: " + pilha.topo());

        System.out.println("Desempilhando livros da pilha: ");

        while(!pilha.estaVazia()){
            System.out.println("Desempilhando livro " + pilha.desempilha());
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.estaVazia());

    }
}
