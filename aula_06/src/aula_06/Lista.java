package aula_06;

import java.util.ArrayList;
import java.util.Scanner;


public class Lista {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		// int numero; <- tipo primitivo
		// Integer num; <- objeto
		//Double num;
		//final int numeroTeste = 0; <- constante
		
		ArrayList<Double> notas = new ArrayList<Double>(); //metodo construtor da classe ArrayList;
		
		/*System.out.println("Digite uma nota: "); construção do método de leitura e inserção
		num = leia.nextDouble();		
		notas.add(num);*/
		
		notas.add(7.0);
		notas.add(4.0);
		notas.add(6.0);
		notas.add(7.0);
		notas.add(9.0);
		
		//for(double nota : notas)
		for(var nota : notas)
			System.out.println(nota);

		System.out.println(notas);
		System.out.println("Posição do elemento 7: " + notas.indexOf(7.0)); //Passa a primeira posição que encontrar. 
		System.out.println("Existe o elemento 7? " + notas.contains(7.0));
		System.out.println("Elemento na posição 1? " + notas.get(1));
		
		notas.remove(3);
		System.out.println(notas);
		
		notas.forEach(System.out::println);

		notas.clear();
		
		System.out.println("A lista está vazia? " + notas.isEmpty());
	}

}
