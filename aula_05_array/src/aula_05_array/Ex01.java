package aula_05_array;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

        // vetor com 10 números
        int[] vetor = {4, 7, 8, 5, 3, 12, 43, 2, 32, 1};

        // número que o usuário deseja procurar
        int numero;

        // armazena a posição onde o número foi encontrado
        // Começa com -1 porque essa posição não existe no vetor
        int posicao = -1;

        // entrada dos dados
        System.out.print("Digite o número que você deseja encontrar: ");
        numero = leia.nextInt();

        // percorrer todas as posições do vetor
        for (int indice = 0; indice < vetor.length; indice++) {

            // verificar se o número da posição atual é igual ao digitado
            if (vetor[indice] == numero) {

                // para guardar a posição onde encontrou o número
                posicao = indice;

               
                break;
            }

        }

        // Verifica se encontrou o número
        if (posicao != -1) {
            System.out.println("O número " + numero +
                               " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + numero +
                               " não foi encontrado!");
        }

        leia.close();
	}

}
