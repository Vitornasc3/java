package aula_04;

import java.util.Scanner;

public class Exerc01 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int num1, num2, contador;

		System.out.print("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();

		System.out.print("Digite o segundo número do intervalo: ");
		num2 = leia.nextInt();

		if (num1 < num2) {
			System.out.printf("No intervalo entre número %d e número %d:", num1, num2);

			for (contador = num1; contador <= num2; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.printf("\nNúmero %d é multiplo de 3 e 5.", contador);
				}
			}

		} else {
			System.out.println("Opção inválida!");
		}

	}

}
