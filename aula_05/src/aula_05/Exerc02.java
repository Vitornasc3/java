package aula_05;

import java.util.Scanner;

public class Exerc02 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int[] numeros = new int[10];
		int soma = 0;
		float media;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Insina um número para alocar no vetor: ");
			numeros[i] = leia.nextInt();
			soma += numeros[i];
		}

		System.out.println("Vetores nas posiçõs ímpares");
		for (int i = 0; i < numeros.length; i++) {
			if (i % 2 == 1) {
				System.out.print(numeros[i] + " | ");
			}

		}
		System.out.println("\nElementos pares");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " | ");
			}
		}

		media = (float) soma / numeros.length;

		System.out.println("\nSoma dos valors: " + soma);
		System.out.println("Média dos valores: " + media);
	}
}
