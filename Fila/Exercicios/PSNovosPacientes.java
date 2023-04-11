package Fila.Exercicios;

import Fila.FilaComPrioridade;

import java.util.Random;

public class PSNovosPacientes implements Runnable{

    private FilaComPrioridade<Pessoa> fila;
    private int cont = 7;
    private Random prioridade = new Random();

    public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {

        for (int i = 0 ; i < 8 ; i++){
            try {
                Pessoa p = new Pessoa("" + cont, prioridade.nextInt(3));
                Thread.sleep(8000);
                fila.enfileira(p);
                cont++;
                System.out.println(p + " enfileirada.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
