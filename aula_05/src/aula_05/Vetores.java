package aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		String[] pessoas = { "Luiza", "Aline", "Vinicius", "Antonio", "Vitor", "Samara" };

		float[] notas = new float[5];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite um valor para a posição [" + i + "]: ");
			notas[i] = leia.nextFloat();
		}
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Posição %d : %s\n", i, notas[i]);
		}

		Arrays.sort(pessoas);
		for (int i = 0; i < pessoas.length; i++) {
			System.out.printf("Posição %d : %s\n", i, pessoas[i]);
		}

		System.out.println("\n");

		for (int i = pessoas.length - 1; i >= 0; i--) {
			System.out.printf("Posição %d : %s\n", i, pessoas[i]);
		}

		System.out.println("A posição do elemento Vitor é: " + Arrays.binarySearch(pessoas, "Vitor"));
		// for each: percorre o vetor/matriz/coleção inteiro, armazena o conteúdo do
		// índice na variavel e você utiliza como quiser.
		for (String pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
}
