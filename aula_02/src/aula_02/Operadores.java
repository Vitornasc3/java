package aula_02;

import java.util.Scanner;

public class Operadores {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		String nome = "Vitor";
		int numero1 = 10, numero2 = 20;
		float media = 2.456789f;
		int tamanho;

		System.out.println("A soma das variáveis 1 e 2 é: " + (numero1 + numero2));

		System.out.printf("A média final do %s é: %.2f", nome, media);

		System.out.println("\nA média final é: " + media);

		System.out.println("Digite o tamanho:");

		tamanho = leia.nextInt();

		System.out.printf("Seu tamanho é: %d", tamanho);
	}

}
