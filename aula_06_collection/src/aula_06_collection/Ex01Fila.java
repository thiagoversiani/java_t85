package aula_06_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01Fila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		
		Queue<String> fila = new LinkedList<>();

        int opcao;
        String nome;

        do {
            System.out.println("\n*****************************************");
            System.out.println("                                         ");
            System.out.println("        1 - Adicionar Cliente            ");
            System.out.println("        2 - Listar todos os Clientes     ");
            System.out.println("        3 - Retirar Cliente da Fila      ");
            System.out.println("        0 - Sair                         ");
            System.out.println("                                         ");
            System.out.println("*****************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = leia.nextInt();
            leia.nextLine(); 
            
            switch (opcao) {
            
            //entrada do cliente na fila
                case 1:
                    System.out.print("Digite o nome do Cliente: ");
                    nome = leia.nextLine();

                    fila.add(nome);

                    System.out.println("\nCliente Adicionado!");
                    break;

                    //mostrar a fila
                case 2:
                    System.out.println("\nLista de Clientes na Fila:");

                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                    
                    //retirar cliente da fila
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("\nA fila está vazia!");
                    } else {
                        System.out.println("\nCliente Chamado: " + fila.poll());
                    }
                    break;
                    
                    //fechar programa
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
