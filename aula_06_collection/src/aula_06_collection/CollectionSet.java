package aula_06_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		ArrayList<String> listaFrutas = new ArrayList<String>(Arrays.asList("Banana", "Pêra"));
		
		frutas.add("Abacate");
		frutas.add("abacate");
		frutas.add("Morango");
		frutas.add("Maça");
		frutas.add("Abacate");
		frutas.add("Laranja");
		frutas.addAll(listaFrutas); //essa aqui foi pra por uma coleção inteira na lista (macã pera)
		
		for(String fruta : frutas) {
			System.out.println(fruta);
			System.out.println(fruta.hashCode());
		}

		//para confirmar se tem o objeto dentro da lista
		System.out.println("A fruta Laranja está presente? " + frutas.contains("Laranja"));
		
		//para remover o obejeto da lista
		frutas.remove("Laranja");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
			}

	}

}
