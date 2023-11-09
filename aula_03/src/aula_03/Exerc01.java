package aula_03;

import java.util.Scanner;

public class Exerc01 {

	static Scanner line = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2, num3;
		System.out.println("Vamos descobrir se a soma dos primeiros dois números é maior que o terceiro número!");
		System.out.print("\nDigite o primeiro número: ");
		num1 = line.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = line.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = line.nextInt();

		if ((num1 + num2) > num3) {
			System.out.printf("A soma de %d e %d é maior que %d.", num1, num2, num3);
		} else if ((num1 + num2) < num3) {
			System.out.printf("A soma de %d e %d é menor que %d.", num1, num2, num3);
		} else {
			System.out.printf("A soma de %d e %d é igual a %d.", num1, num2, num3);
		}
	}

}
