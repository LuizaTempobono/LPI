package com.company;
import java.util.ArrayList;

public class Zoologico {
    ArrayList<Animal> animais = new ArrayList<Animal>();

    public void adicionarAnimal (Animal animal){
        animais.add(animal);
    }

    public void listarAnimais(){
        System.out.println("Lista dos animais presentes nesse zoológico: ");
        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome() + " - Idade: " + animal.getIdade() + " - Espécie: " + animal.getEspecie() + " - Alimentado: " + animal.getAlimentado());  
        }
    }

    public void alimentarAnimais(){
        for (Animal animal : animais) {
            animal.setAlimentado(true);
        }
        System.out.println("Animais alimentados com sucesso!");
    }
}
