package aula_04_repeticoes;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int idade, menores21 = 0, maiores50 = 0;
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade>=0) {
			
			if (idade < 21) {
				menores21 ++;
			}
			
			if (idade > 50) {
				maiores50 ++;
			}
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			
		}
		
		System.out.println("Total de pessoas menores que 21 anos: " + menores21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);


		
		leia.close();
	}

}
