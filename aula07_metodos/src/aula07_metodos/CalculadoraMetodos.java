package aula07_metodos;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
		
        Scanner leia = new Scanner(System.in);

        double numero1, numero2;
        
        System.out.println("***CALCULADORA BASICA***");
        
        
        System.out.println("Digite o primeiro número: ");
        numero1 = leia.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        numero2 = leia.nextDouble();

        //aqui foi chamado as operações matemáticas e vai ser usado para somar o que está dentro dele
        System.out.printf("%.2f + %.2f = %.2f\n", numero1, numero2, somar(numero1, numero2));
        System.out.printf("%.2f - %.2f = %.2f\n", numero1, numero2, subtrair(numero1, numero2));
        System.out.printf("%.2f * %.2f = %.2f\n", numero1, numero2, multiplicar(numero1, numero2));
        System.out.printf("%.2f / %.2f = %.2f\n", numero1, numero2, dividir(numero1, numero2));
        
        //chamando o void
        sobre();
        
        leia.close();
	}
	//aqui é feito o calculo q vai ser chamado e aplicado em cima pelo somar
	public static double somar(double coringa1, double coringa2) {
		return coringa1 + coringa2;
	}
	
	
	public static double subtrair(double coringa1, double coringa2) {
		return coringa1 - coringa2;
	}
	
	
	public static double multiplicar(double coringa1, double coringa2) {
		return coringa1 - coringa2;
	}
	
	public static double dividir(double coringa1, double coringa2) {
		return coringa1 / coringa2;
	}
	
	public static void sobre() {
		System.out.println("Projeto Calculadora Básica");
		System.out.println("Desenvolvido por: Thiago");
		
	}
}
