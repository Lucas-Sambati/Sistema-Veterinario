package com.example.service;

import java.util.ArrayList;
import java.util.List;
import com.example.object.Animal;

public class ServicoAnimal {
    private List<Animal> listaAnimais;

    public ServicoAnimal() {
        this.listaAnimais = new ArrayList<>();
    }

    // Método para retornar a lista dos animais existentes
    public List<Animal> getListaAnimais() {
        return listaAnimais;
    }

    // Método para cadastrar novos animais
    public void cadastrarAnimal(Animal animal) {
        listaAnimais.add(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }

    // Método para buscar animais pela id
    public void buscaAnimal(String idAnimal) {
        if (listaAnimais.isEmpty()) {
            System.out.println("Não há animais cadastrados.");
            return;
        } else
            for (Animal animal : listaAnimais) {
                if (animal.getId().equals(idAnimal)) {
                    System.out.println("Animal encontrado:");
                    System.out.println("Id: " + animal.getId());
                    System.out.println("Nome: " + animal.getNome());
                    System.out.println("Raça: " + animal.getRaca());
                    System.out.println("Cor: " + animal.getCor());
                    return;
                }
            }
    }

    // Método para alterar informações de um animal
    public void alteraAnimal(String idAnimal, Animal novoAnimal) {
        for (int i = 0; i < listaAnimais.size(); i++) {
            if (listaAnimais.get(i).getId().equals(idAnimal)) {
                listaAnimais.set(i, novoAnimal);
                System.out.println("Animal alterado com sucesso!");
                return;
            }
        }
        System.out.println("Animal não encontrado.");
    }

    // Método para excluir animais
    public void excluiAnimal(String idAnimal) {
        for (int i = 0; i < listaAnimais.size(); i++) {
            if (listaAnimais.get(i).getId().equals(idAnimal)) {
                listaAnimais.remove(i);
                System.out.println("Animal excluído com sucesso!");
                return;
            }
        }
        System.out.println("Animal não encontrado.");
    }

    // Método para listar todos os animais cadastrados no sistema
    public void consultarAnimais() {
        if (listaAnimais.isEmpty()) {
            System.out.println("Não há animais cadastrados.");
            return;
        }

        System.out.println("Lista de Animais:");
        for (Animal animal : listaAnimais) {
            System.out.println("Id: " + animal.getId());
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Raça: " + animal.getRaca());
            System.out.println("Cor: " + animal.getCor());
            System.out.println();
        }
    }
}
