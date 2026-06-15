package aula_03_condicionais;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
        int numero = leia.nextInt();
        String paridade;
        String sinal;

       
        if (numero % 2 == 0) {
            paridade = "par";
        } else {
            paridade = "ímpar";
        }

       
        if (numero >= 0) {
            sinal = "positivo";
        } else {
            sinal = "negativo";
        }

        System.out.println("O Número " + numero + " é " + paridade + " e " + sinal + "!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		leia.close();

	}

}
