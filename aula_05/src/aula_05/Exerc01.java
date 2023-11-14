package aula_05;

import java.util.Scanner;

public class Exerc01 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int num = -1, localizador;
		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("digita o número para ser localizado no vetor");
		localizador = leia.nextInt();

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == localizador) {
				num = i;
			}
		}

		if (num == -1) {
			System.out.printf("O número %d não foi localizado.", localizador);
		} else
			System.out.printf("O número %d foi localizado na posição %d do vetor.", localizador, num);
	}
}
