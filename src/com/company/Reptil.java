package com.company;

public class Reptil extends Animal implements Alimentavel{
    private double tempCorporal;

    public Reptil(String nome, int idade, String especie, boolean alimentado, double tempCorporal) {
        super(nome, idade, especie, alimentado);
    }

    public double getTempCorporal() {
        return tempCorporal;
    }
    public void setTempCorporal(double tempCorporal) {
        this.tempCorporal = tempCorporal;
    }
    @Override
    public void emitirSom() {
        System.out.println("Som característico dos répteis");
    }
    @Override
    public void alimentar() {
        System.out.println("A ave foi alimentada");
    }
}