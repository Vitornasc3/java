package aula_06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exerc04 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet<Integer>();
		Integer num;

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();

		if (numeros.contains(num))
			System.out.printf("O número %d foi encontrado!", num);
		else
			System.out.printf("O número %d não foi encontrado!", num);

	}

}
