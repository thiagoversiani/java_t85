package aula_06_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01List {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		 ArrayList<String> cores = new ArrayList<>();

	        //entrada dos dados
	        for (int contador = 1; contador <= 5; contador++) {
	            System.out.print("Digite a " + contador + "ª cor: ");
	            cores.add(leia.nextLine());
	        }

	        //listar as cores
	        System.out.println("\nListar todas as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }

	        //ordem crescente
	        Collections.sort(cores);

	        //cores ordenadas
	        System.out.println("\nOrdenar as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }
		
		leia.close();
	}

}
