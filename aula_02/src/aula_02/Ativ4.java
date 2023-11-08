package aula_02;

import java.util.Scanner;

public class Ativ4 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite o primeiro número: ");
		float num1 = leia.nextFloat();
		System.out.println("Digite o segundo número: ");
		float num2 = leia.nextFloat();
		System.out.println("Digite o terceiro número: ");
		float num3 = leia.nextFloat();
		System.out.println("Digite o quarto número: ");
		float num4 = leia.nextFloat();

		float dif = ((num1 * num2) - (num3 * num4));
		System.out.printf("A diferença entre os números é: %.1f.", dif);
	}

}
