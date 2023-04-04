package Pilha.Exercicios;

import Pilha.Pilha;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        Scanner scanner = new Scanner(System.in);

        for (int i=1 ; i <= 10 ; i++){

            System.out.println("Entre com um número");

            int num = scanner.nextInt();

            if(num % 2 == 0){

                System.out.println("Empilhando o número " + num);
                pilha.empilha(num);
            }else{

                Integer desempilhado = pilha.desempilha();

                if(desempilhado == null){
                    System.out.println("Pilha está vazia");
                }else{
                    System.out.println("Número ímpar, desempilhado um elemento da pilha: "
                            + desempilhado);
                }
            }
        }

        System.out.println("Todos os números foram lidos, desempilhando números da pilha");

        while (!pilha.estaVazia()) {

            System.out.println("Desempilhado um elemento da pilha: "
                    + pilha.desempilha());
        }

        System.out.println("Todos os elementos foram desempilhados");
    }
}
