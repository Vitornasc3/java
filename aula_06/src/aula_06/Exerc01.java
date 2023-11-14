package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc01 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite a %dª cor: ", (i + 1));
			cores.add(leia.nextLine());

		}
		System.out.println("\nLista das cores: \n");

		cores.forEach(System.out::println);

		cores.sort(null);

		System.out.println("\nLista das cores ordenadas: ");

		cores.forEach(System.out::println);

	}

}
