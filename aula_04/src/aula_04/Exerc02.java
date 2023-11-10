package aula_04;

import java.util.Scanner;

public class Exerc02 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int contador, numerosPares = 0, numerosImpares = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Digite o %dº número: \n", i);
			contador = leia.nextInt();

			if (contador % 2 == 0) {
				numerosPares++;
			} else {
				numerosImpares++;

			}

		}
		System.out.println("Total de números pares: " + numerosPares);
		System.out.println("\nTotal de números ímpares: " + numerosImpares);

	}

}
