package aula_06_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionFila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		
		Queue<String> fila = new LinkedList<String>();
	
		fila.add("Thiago");
		fila.add("Guilherme");
		fila.add("Higor");
		fila.add("Sara");
		fila.add("Bella");
		
		//System.out.println("Digite seu nome: ");
		//fila.add(leia.next());

		//mostrar a remoção (sempre vai remover o primeiro)
		fila.remove();
		fila.remove();
		
		//mostrar se um elemento ainda está na fila pelo boolean (true ou false)
		System.out.println("Sara ainda está na fila? " + fila.contains("Sara"));
		
		for(var cliente : fila) {
			System.out.println(cliente);
			

}
		leia.close();

}
	}


