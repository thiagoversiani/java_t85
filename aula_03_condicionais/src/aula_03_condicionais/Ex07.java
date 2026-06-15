package aula_03_condicionais;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float numero1, numero2, resultado;
        int operacao;

        System.out.print("Digite o 1º número: ");
        numero1 = leia.nextFloat();

        System.out.print("Digite o 2º número: ");
        numero2 = leia.nextFloat();

        System.out.print("Operação: ");
        operacao = leia.nextInt();

        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println(numero1 + " + " + numero2 + " = " + resultado);
                break;

            case 2:
                resultado = numero1 - numero2;
                System.out.println(numero1 + " - " + numero2 + " = " + resultado);
                break;

            case 3:
                resultado = numero1 * numero2;
                System.out.println(numero1 + " * " + numero2 + " = " + resultado);
                break;

            case 4:
                resultado = numero1 / numero2;
                System.out.println(numero1 + " / " + numero2 + " = " + resultado);
                break;

            default:
                System.out.println("Operação Inválida!");
        }
		
		
		
		
		
		
		
		
		
		leia.close();

	}

}
