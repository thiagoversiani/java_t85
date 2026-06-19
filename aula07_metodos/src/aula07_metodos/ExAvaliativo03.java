package aula07_metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class ExAvaliativo03 {

	// as coleções para armazenar o estoque
	static ArrayList<String> produtos = new ArrayList<String>();
	static ArrayList<Integer> quantidades = new ArrayList<Integer>();

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		//loop do menu
		do {

			System.out.println("*********************************************");
			System.out.println("                                             ");
			System.out.println("             CONTROLE DE ESTOQUE             ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.println("                                             ");
			System.out.println("         1 - Adicionar produto               ");
			System.out.println("         2 - Atualizar quantidade            ");
			System.out.println("         3 - Listar produtos                 ");
			System.out.println("         0 - Sair                            ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.print("           Escolha:                            ");
			opcao = leia.nextInt();

			//executa de acordo com a opção escolhida
			switch (opcao) {

			case 1:
				adicionarProduto(leia);
				break;

			case 2:
				atualizarProduto(leia);
				break;

			case 3:
				listarProdutos();
				break;

			case 0:
				System.out.println("Encerrando sistema...");
				break;

			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 0);

		leia.close();
	}

	// Método para adicionar produto
	public static void adicionarProduto(Scanner leia) {

		System.out.print("Nome do produto: ");
		String nome = leia.next();

		System.out.print("Quantidade: ");
		int quantidade = leia.nextInt();

		produtos.add(nome);
		quantidades.add(quantidade);

		System.out.println("Produto adicionado com sucesso!");
	}

	// Metodo para atualizar quantidade
	public static void atualizarProduto(Scanner leia) {

		System.out.print("Nome do produto para atualizar: ");
		String nome = leia.next();

		for (int numero = 0; numero < produtos.size(); numero++) {

			if (produtos.get(numero).equalsIgnoreCase(nome)) {

				System.out.print("Nova quantidade: ");
				int novaQtd = leia.nextInt();

				quantidades.set(numero, novaQtd);

				System.out.println("Quantidade atualizada!");
				return;
			}
		}

		System.out.println("Produto não encontrado!");
	}

	// Método para listar os produtos
	public static void listarProdutos() {

		if (produtos.isEmpty()) {
			System.out.println("Estoque vazio.");
			return;
		}

		for (int numero = 0; numero < produtos.size(); numero++) {

			System.out.println("Produto: " + produtos.get(numero)
					+ " | Quantidade: " + quantidades.get(numero));
		}
	}

}