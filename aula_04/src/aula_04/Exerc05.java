package aula_04;

import java.util.Scanner;

public class Exerc05 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int numero = 0, numeroPositivo = 0;

		do {

			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if (numero > 0) {
				numeroPositivo += numero;
			}

		} while (numero != 0);
		
		System.out.println("A soma dos números positivos é: " + numeroPositivo);
	}

}
