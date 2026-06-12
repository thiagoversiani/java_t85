package aula_02_operadores;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		
		int numero1 = 4;
		int numero2 = 4;
		int numero3 = 4;
		int numero4 = 4;
		int numero5 = 4;
		
		System.out.println("Atribuição com Soma: " + (numero1 += 2));
		
		System.out.println("Atribuição com subtração: " + (numero3 -= 2));
		
		System.out.println("Atribuição com multiplicação: " + (numero4 *= 2));
		
		System.out.println("Atribuição com divisão: " + (numero5 /= 2));
		
		System.out.println("Atribuição com módulo: " + (numero1 %= 2));

	}

}
