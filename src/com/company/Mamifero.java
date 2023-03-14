package com.company;

public class Mamifero extends Animal implements Alimentavel {
    private int tempoGestacao;

    public Mamifero(String nome, int idade, String especie, boolean alimentado, String tempoGestacao) {
        super(nome, idade, especie, alimentado);
    }


    public int getTempoGestacao(){
        return tempoGestacao;
    }
    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }
    @Override
    public void emitirSom() {
        System.out.println("Som característico dos mamíferos");
    }
    @Override
    public void alimentar() {
        System.out.println("A ave foi alimentada");
    }
}
