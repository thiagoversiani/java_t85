package aula_04_repeticoes;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero, pares = 0, impares = 0;
		
		for (numero = 1; numero <= 10; numero ++) {
			
			System.out.println("Digite o " + numero + "º número: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				pares ++;
			} else {
				impares ++;
			}
		}
		
		System.out.println("Total de números pares: " + pares);
		System.out.println("Total de números impares: " + impares);

		
		leia.close();

	}

}
