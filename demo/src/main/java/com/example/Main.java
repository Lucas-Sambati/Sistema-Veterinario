package com.example;

import java.util.Scanner;
import com.example.object.Animal;
import com.example.service.ServicoAnimal;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicoAnimal sistema = new ServicoAnimal();

        int opcao;

        do {
            System.out.println("-------------------------------");
            System.out.println("| Menu:                       |");
            System.out.println("| 1 - Cadastrar Animal        |");
            System.out.println("| 2 - Buscar Animal           |");
            System.out.println("| 3 - Alterar Animal          |");
            System.out.println("| 4 - Excluir Animal          |");
            System.out.println("| 5 - Exibir Todos os Animais |");
            System.out.println("| 6 - Sair                    |");
            System.out.println("-------------------------------");
            System.out.println("");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            System.out.println("");
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar Animal:");
                    System.out.print("Id: ");
                    String id = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Raça: ");
                    String raca = scanner.nextLine();
                    System.out.print("Cor: ");
                    String cor = scanner.nextLine();
                    sistema.cadastrarAnimal(new Animal(id, nome, raca, cor));
                    break;

                case 2:
                    System.out.println("Buscar Animal:");
                    System.out.print("Digite o id do animal que deseja buscar: ");
                    String idBusca = scanner.nextLine();
                    System.out.println("");
                    sistema.buscaAnimal(idBusca);
                    break;

                case 3:
                    System.out.println("Alterar Animal:");
                    System.out.print("Digite o id do animal que deseja alterar: ");
                    String idAlteracao = scanner.nextLine();
                    System.out.println("Novo Id:");
                    String novoId = scanner.nextLine();
                    System.out.println("Novo Nome:");
                    String novoNome = scanner.nextLine();
                    System.out.println("Nova Raça:");
                    String novaRaca = scanner.nextLine();
                    System.out.println("Nova Cor:");
                    String novaCor = scanner.nextLine();
                    sistema.alteraAnimal(idAlteracao, new Animal(novoId, novoNome, novaRaca, novaCor));
                    break;

                case 4:
                    System.out.println("Excluir Animal:");
                    System.out.print("Digite o id do animal que deseja exlcuir: ");
                    String idExclusao = scanner.nextLine();
                    System.out.println("");
                    sistema.excluiAnimal(idExclusao);
                    break;

                case 5:
                    System.out.println("Consultar Todos os Animais:");
                    sistema.consultarAnimais();
                    break;

            }
        } while (opcao != 6);

        scanner.close();
    }
}
