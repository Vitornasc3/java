package aula_04;

import java.util.Scanner;

public class Exerc06 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero = 0, acumulador = 0;
		float media, somaMultiplos = 0f;

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				somaMultiplos += numero;
				acumulador++;
			}

		} while (numero != 0);

		media = somaMultiplos / acumulador;
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f.", media);
	}

}
