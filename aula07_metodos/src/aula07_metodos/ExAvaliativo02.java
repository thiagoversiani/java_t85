package aula07_metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class ExAvaliativo02 {

	// Lista global de alunos
		static ArrayList<String> nomes = new ArrayList<String>();
		static ArrayList<Integer> idades = new ArrayList<Integer>();
		static ArrayList<Float> notas = new ArrayList<Float>();
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int opcao;

		do {
			
			System.out.println("*******************************************");
			System.out.println("                                           ");
			System.out.println("                   MENU                    ");
			System.out.println("                                           ");
			System.out.println("*******************************************");
			System.out.println("        1 - Adicionar aluno                ");
			System.out.println("        2 - Listar alunos                  ");
			System.out.println("        3 - Média geral das notas          ");
			System.out.println("        0 - Sair                           ");
			System.out.println("                                           ");
			System.out.println("*******************************************");
			System.out.print("          Escolha:                           ");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				adicionarAluno(leia);
				break;

			case 2:
				listarAlunos();
				break;

			case 3:
				calcularMedia();
				break;

			case 0:
				System.out.println("Encerrando programa...");
				break;

			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 0);

		leia.close();
	}

	// adicionar os alunos
	public static void adicionarAluno(Scanner leia) {

		System.out.print("Nome do aluno: ");
		String nome = leia.next();

		System.out.print("Idade: ");
		int idade = leia.nextInt();

		System.out.print("Nota final: ");
		float nota = leia.nextFloat();

		nomes.add(nome);
		idades.add(idade);
		notas.add(nota);

		System.out.println("Aluno cadastrado com sucesso!");
	}

	// listar os alunos
	public static void listarAlunos() {

		if (nomes.isEmpty()) {
			System.out.println("Nenhum aluno cadastrado.");
			return;
		}

		for (int i = 0; i < nomes.size(); i++) {

			System.out.println("\nAluno " + (i + 1));
			System.out.println("Nome: " + nomes.get(i));
			System.out.println("Idade: " + idades.get(i));
			System.out.println("Nota: " + notas.get(i));
		}
	}

	// calcular a média dos alunos
	public static void calcularMedia() {

		if (notas.isEmpty()) {
			System.out.println("Nenhuma nota cadastrada.");
			return;
		}

		float soma = 0;

		for (float nota : notas) {
			soma += nota;
		}

		float media = soma / notas.size();

		System.out.println("Média geral das notas: " + media);
	
		

	}
			
		
	}


