package com.example.object;

public class Animal {
    private String id;
    private String nome;
    private String raca;
    private String cor;

    // Contrutor
    public Animal(String id, String nome, String raca, String cor) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.cor = cor;
    }

    public Animal() {
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
