package aula_06_collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionPilha {

	public static void main(String[] args) {

		Deque<String> pilha = new ArrayDeque<String>();
	
		pilha.push("Azul");
		pilha.push("Verde");
		pilha.push("Amarelo");
		pilha.push("Branco");
		pilha.push("Laranja");

		//remover o ultimo da fila (que é o primeiro)
		pilha.pop();
		
		System.out.println("A cor Azul ainda está na Pilha? " + pilha.contains("Azul"));
		
		//lista do ultimo ao primeiro (funciona como pilha de prato de self service)
		for(var cor : pilha) {
			System.out.println(cor);
		}
	}
	
}
