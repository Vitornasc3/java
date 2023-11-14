package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exerc03 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Insira um número:");
			numeros.add(leia.nextInt());
		}

		Iterator<Integer> iNumeros = numeros.iterator();

		System.out.println("Lista dos dados inseridos: ");

		while (iNumeros.hasNext())
			System.out.println(iNumeros.next());

	}

}
