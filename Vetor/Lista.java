package Vetor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lista<T>{

    private T[] elemesntos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elemesntos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elemesntos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento){
        this.aumentaCapacidade();
        if(this.tamanho < this.elemesntos.length){
            this.elemesntos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, T elemento){

        if(!(posicao >= 0 && posicao < tamanho)){
            throw  new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho ; i >= posicao ; i--){
            this.elemesntos[i+1] = this.elemesntos[i];
        }
        this.elemesntos[posicao]= elemento;
        this.tamanho++;
        return false;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elemesntos.length){
            T[] elementosNovos = (T[]) new Object[this.elemesntos.length * 2];
            for(int i = 0 ; i < this.elemesntos.length ; i++){
                elementosNovos[i] = this.elemesntos[i];
            }
            this.elemesntos = elementosNovos;
        }
    }

    public Object busca(int posicao){
        posicao -= 1;
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elemesntos[posicao];
    }

    public int busca(T elemento){
        for(int i = 0 ; i < this.tamanho ; i++){
            if(this.elemesntos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public int ultimoIndice(T elemento){

        int ultimaPos = -1;
        for(int i = this.tamanho - 1 ; i >= 0 ; i--){
            if(this.elemesntos[i].equals(elemento)){
                return i;
            }
        }

        return -1;
    }

    public boolean contem(T elemento){

//        int pos = busca(elemento);
//        if(pos > -1){
//            return true;
//        }
//        return false;

        return busca(elemento) > -1;
    }

    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i = posicao ; i < this.tamanho - 1 ; i++){
            this.elemesntos[i] = this.elemesntos[i + 1];
        }
        this.tamanho--;
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
