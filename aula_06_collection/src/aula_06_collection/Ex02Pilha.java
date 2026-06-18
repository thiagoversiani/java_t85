package aula_06_collection;

import java.util.Scanner;
import java.util.Stack;

public class Ex02Pilha {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        Stack<String> pilha = new Stack<>();

        int opcao;
        String livro;

        do {

            System.out.println("\n*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Adicionar Livro                      ");
            System.out.println("            2 - Listar todos os Livros               ");
            System.out.println("            3 - Retirar Livro da Pilha               ");
            System.out.println("            0 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.print("Entre com a opção desejada: ");

            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {

            // Adicionar livro na pilha
            case 1:
                System.out.print("Digite o nome do Livro: ");
                livro = leia.nextLine();

                pilha.push(livro);

                System.out.println("\nPilha:");
                for (String item : pilha) {
                    System.out.println(item);
                }

                System.out.println("\nLivro Adicionado!");
                break;

            // Listar livros da pilha
            case 2:
                System.out.println("\nLista de Livros na Pilha:");

                if (pilha.isEmpty()) {
                    System.out.println("A pilha está vazia!");
                } else {
                    for (String item : pilha) {
                        System.out.println(item);
                    }
                }
                break;

            // Retirar livro da pilha
            case 3:
                if (pilha.isEmpty()) {
                    System.out.println("\nA pilha está vazia!");
                } else {

                    pilha.pop();

                    System.out.println("\nPilha:");
                    for (String item : pilha) {
                        System.out.println(item);
                    }

                    System.out.println("\nO Livro foi Retirado!");
                }
                break;

            // Encerrar programa
            case 0:
                System.out.println("\nPrograma Finalizado!");
                break;

            default:
                System.out.println("\nOpção Inválida!");
            }

        } while (opcao != 0);

        leia.close();
    }
}