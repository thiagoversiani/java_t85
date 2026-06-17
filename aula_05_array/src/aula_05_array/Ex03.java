package aula_05_array;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        // entrada dos valores da matriz
        System.out.println("Digite os 9 valores da matriz 3x3:");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                matriz[linha][coluna] = leia.nextInt();
            }
        }

        System.out.println("\nElementos da Diagonal Principal:");

        // diagonal principal
        for (int linha = 0; linha < 3; linha++) {
            System.out.print(matriz[linha][linha] + " ");
            somaPrincipal += matriz[linha][linha];
        }

        System.out.println("\n\nElementos da Diagonal Secundária:");

        // Diagonal secundária
        for (int linha = 0; linha < 3; linha++) {
            System.out.print(matriz[linha][2 - linha] + " ");
            somaSecundaria += matriz[linha][2 - linha];
        }

        System.out.printf("\nSoma dos Elementos da Diagonal Principal: %d", somaPrincipal);

        System.out.printf("\nSoma dos Elementos da Diagonal Secundária: %d", somaSecundaria);

        leia.close();
	}

}
