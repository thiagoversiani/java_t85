package aula_02_operadores;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		
		float numero3, numero4;
		

		System.out.print("Digite o salário: ");
				numero3 = leia.nextFloat();
		System.out.print("Digite o abono salarial: ");
				numero4 = leia.nextFloat();
				
		System.out.printf("Novo Salário: %.2f", numero3 + numero4);		
	
	}

}
