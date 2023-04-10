package Pilha.Exercicios;

import Pilha.Pilha;

import java.util.Stack;

public class ex04 {

    public static void main(String[] args) {

        Stack<Livro> pilha = new Stack<Livro>();

        Livro livro;

        System.out.println("Pilha de livros criada, pilha está está vazia? " + pilha.isEmpty());

        System.out.println("Empilhando livros na pilha");

        for(int i = 1 ; i <= 4 ; i++){

            livro = new Livro();
            livro.setNome("Livro " + i);
            livro.setAutor("Autor " + i);
            livro.setIsbn("12345"+i);
            livro.setAnoLancamento(2020+i);

            pilha.push(livro);
        }

        System.out.println(pilha.size() + " livros foram empilhados: ");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está está vazia? " + pilha.isEmpty());

        System.out.println("Espiando o topo da pilha: " + pilha.peek());

        System.out.println("Desempilhando livros da pilha: ");

        while(!pilha.isEmpty()){
            System.out.println("Desempilhando livro " + pilha.pop());
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.isEmpty());

    }
}
