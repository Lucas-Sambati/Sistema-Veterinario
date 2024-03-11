package com.example;

import com.example.object.Animal;
import com.example.service.ServicoAnimal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import static org.junit.Assert.*;

public class TesteServicoAnimal {
    private ServicoAnimal servicoAnimal;

    @Before
    public void setUp() {
        servicoAnimal = new ServicoAnimal();
    }

    @After
    public void tearDown() {
        servicoAnimal = null;
    }

    /**
     * Caso de teste
     * Entrada -> 1 produto
     * Saída esperada -> um produto com as mesmas 5 informações antes inseridas
     */
    @Test
    public void casoTesteCadastroAnimal() {
        Animal animal = new Animal("Id Teste", "Nome teste", "Raça teste", "Cor teste");
        servicoAnimal.cadastrarAnimal(animal);
        List<Animal> listaAnimais = servicoAnimal.getListaAnimais();
        assertTrue(listaAnimais.contains(animal));
    }

}
