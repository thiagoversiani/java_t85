package aula_06_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex03Set {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>();

        //entrada dos numero dentro do set
		System.out.println("\nDigite 10 valores inteiros:");
        
        for (int contador = 1; contador <= 10; contador++) {
            System.out.print("Número " + contador + ": ");
            numeros.add(leia.nextInt());
        }
        
        //converter o Set para ArrayList
        ArrayList<Integer> listaNumeros = new ArrayList<>(numeros);

        //ordem crescente
        Collections.sort(listaNumeros);

        System.out.println("\nListar dados do Set:");

        for (Integer numero : listaNumeros) {
            System.out.println(numero);
        }
		
		
		leia.close();
	}

}
