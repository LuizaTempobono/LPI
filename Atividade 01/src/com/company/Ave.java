package com.company;

public class Ave extends Animal implements Alimentavel {
    private String tipoBico;

    public Ave (String nome, int idade, String especie, boolean alimentado, String tipoBico) {
        super(nome, idade, especie, alimentado);
    }
    
    public String getTipoBico() {
        return tipoBico;
    }

    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som característico das aves");
    }
    @Override
    public void alimentar() {
        System.out.println("A ave foi alimentada");
    }

}
