package com.company;


public class Main {

    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        zoologico.animais.add(new Ave("Paçoca", 1, "Arara", false, "Curvado"));
        zoologico.animais.add(new Reptil("Cuca", 8, "Jacaré", false, 34.0f));
        zoologico.animais.add(new Mamifero("Jorge", 20, "Elefante", false, "22 meses"));
        zoologico.animais.add(new Mamifero("Farofa", 3, "Bicho preguiça", false, "182 dias"));
        zoologico.animais.add(new Mamifero("Mark", 10, "Baleia", false, "17 meses"));
        zoologico.listarAnimais();
        zoologico.alimentarAnimais();
        zoologico.listarAnimais();
    }
}
