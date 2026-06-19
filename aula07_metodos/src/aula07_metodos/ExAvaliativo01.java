package aula07_metodos;

import java.util.ArrayList;

public class ExAvaliativo01 {

	public static void main(String[] args) {

		// fazer uma ArrayList para armazenar números inteiros
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		// adicionar valores na coleção
		numeros.add(2);
		numeros.add(5);
		numeros.add(8);
		numeros.add(3);
		numeros.add(10);

		// chamar o método responsável por analisar os números
		analisarNumeros(numeros);

	}

	// método que recebe a coleção e realiza os cálculos
	public static void analisarNumeros(ArrayList<Integer> numeros) {

		// Variável para somar todos os números da coleção
		int soma = 0;

		// aqui assumimos que o primeiro número é o maior
		int maior = numeros.get(0);

		// laço para percorrer todos os números
		for (int numero : numeros) {

			// ir somando o valor atual ao próximo numero
			soma += numero;

			// aqui verifica se o número atual é maior que o maior encontrado até agora
			if (numero > maior) {
				maior = numero;
			}

		}

		// aqui calculo a média dos numeros, transformando eles de int para double
		double media = (double) soma / numeros.size();

		// mostrei todos os números
		System.out.println("Coleção: " + numeros);

		// mostrei as soma de todos os números
		System.out.println("Soma: " + soma);

		// mostrei a média dos números
		System.out.println("Média: " + media);

		// mostrei o maior valor encontrado na coleção
		System.out.println("Maior valor: " + maior);

	}

}