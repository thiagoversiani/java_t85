package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaude {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		
		System.out.println("Dgite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Dgite a sua idade: ");
		idade = leia.nextInt();
		
		/**
		 * 0 - 10 = 100,00
		 * 11 - 29 = 200,00
		 * 30 - 45 = 300,00
		 * 46 - 59 = 500,00
		 * 60 - 65 = 600,00
		 * Acima 65 = 1000,00
		 */
		
		System.out.printf("Nome: %s", nome);
		
		if(idade > 0 && idade <= 10) {
			System.out.println("\nA mensalidade fo Plano é 100 reais");
		} else if(idade >= 11 && idade <= 29) {
			System.out.println("\nA mensalidade fo Plano é 200 reais");
		} else if(idade >= 30 && idade <= 45) {
			System.out.println("\nA mensalidade fo Plano é 300 reais");
		} else if(idade >= 46 && idade <= 59) {
			System.out.println("\nA mensalidade fo Plano é 500 reais");
		} else if(idade >= 60 && idade <= 65) {
			System.out.println("\nA mensalidade fo Plano é 600 reais");
		} else {
			System.out.println("\nA mensalidade fo Plano é 1000 reais");
		}
		
		
		
		
		leia.close();
	}

}
