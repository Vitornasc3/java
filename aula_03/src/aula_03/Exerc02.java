package aula_03;

import java.util.Scanner;

public class Exerc02 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int numero;
		System.out.println("Vamos informar se o número é impar ou par e se é negativo ou positivo!");
		System.out.print("Digite um número inteiro: ");
		numero = leia.nextInt();

		if (numero < 0 && numero % 2 == 0) {
			System.out.printf("O número %d é negativo e par!", numero);
		} else if (numero < 0 && numero % 2 == -1) {
			System.out.printf("O número %d é negativo e ímpar!", numero);
		} else if (numero > 0 && numero % 2 == 0) {
			System.out.printf("O número %d é positivo e par!", numero);
		} else if (numero > 0 && numero % 2 == 1) {
			System.out.printf("O número %d é positivo e ímpar!", numero);
		} else {
			System.out.println("O número que você digitou foi zero!");
		}
	}

}
