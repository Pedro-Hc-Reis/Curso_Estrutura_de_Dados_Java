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

    public boolean adiciona(int posicao, String elemento){

        if(!(posicao >= 0 && posicao < tamanho)){
            throw  new IllegalArgumentException("Posição inválida");
        }
        for (int i = this.tamanho ; i >= posicao ; i--){
            this.elemesntos[i+1] = this.elemesntos[i];
        }
        this.elemesntos[posicao]= elemento;
        this.tamanho++;
        return false;
    }

    public String busca(int posicao){
        posicao -= 1;
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elemesntos[posicao];
    }

    public int busca(String elemento){
        for(int i = 0 ; i < this.tamanho ; i++){
            if(this.elemesntos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
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
