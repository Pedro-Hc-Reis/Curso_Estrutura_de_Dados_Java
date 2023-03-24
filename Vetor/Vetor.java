package Vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elemesntos;
    private int tamanho;

    public  Vetor(int capacidade){
        this.elemesntos = new String[capacidade];
        this.tamanho = 0;
    }

    /*
    public void adiciona(String elemento){
        for (int i = 0 ; i < this.elemesntos.length ; i++){
            if (this.elemesntos[i] == null){
                this.elemesntos[i] = elemento;
                break;
            }
        }
    }
     */

    /*
    public void adiciona(String elemento) throws Exception{

        if(this.tamanho < this.elemesntos.length){
            this.elemesntos[this.tamanho] = elemento;
            this.tamanho++;
        }else{
            throw  new Exception("Vetor já está cheio");
        }
    }
     */

    public boolean adiciona(String elemento){

        if(this.tamanho < this.elemesntos.length){
            this.elemesntos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0 ; i < this.tamanho - 1 ; i++){
            s.append(this.elemesntos[i]);
            s.append(", ");
        }

        if(this.tamanho > 0){
            s.append(this.elemesntos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
