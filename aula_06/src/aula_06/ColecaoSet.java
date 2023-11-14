package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class ColecaoSet {

	public static void main(String[] args) {
	
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("Abacate");
		frutas.add("Morango");
		frutas.add("Jaboticaba");
		frutas.add("Kiwi");
		//frutas.add(null);
		
		System.out.println(frutas);
		//frutas.forEach(System.out::println);
		
		for(var fruta : frutas)
			System.out.println(fruta.hashCode());
			
		System.out.println("A fruta morango existe? " + frutas.contains("Morango"));
		
		frutas.remove("Morango");
		System.out.println(frutas);
		
		Iterator<String> iFrutas = frutas.iterator();
		
		while(iFrutas.hasNext())
			System.out.println(iFrutas.next());
		
		//criamos array list
		ArrayList<String> frutasList = new ArrayList<String>();
		
		//ArrayList<String> frutasList = new ArrayList<String>(frutas); <-- faz o processo sem necessidade do .addAll
		
		// Adicionamos todos os elementos do metodo HashSet na ArrayList
		frutasList.addAll(frutas);
		
		// Ordenamos os dados em ordem crescente
		frutasList.sort(null);
		
		System.out.println(frutasList);
		
		frutasList.sort(Comparator.reverseOrder());
		
		System.out.println(frutasList);

	}

}
