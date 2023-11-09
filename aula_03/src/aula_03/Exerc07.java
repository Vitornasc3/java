package aula_03;

import java.util.Scanner;

public class Exerc07 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int operador;
		float num1, num2, resultado;
		System.out.print("Digite o primeiro número: ");
		num1 = leia.nextFloat();
		System.out.print("Digite o segundo número: ");
		num2 = leia.nextFloat();

		System.out.println("----- Calculadora -----\n1 - Soma\n2 - Subtração\n3 - "
				+ "Multiplicação\n4 - Divisão\nEscolha uma das opções acima:");
		operador = leia.nextInt();

		switch (operador) {
		case 1:
			resultado = (num1 + num2);
			System.out.printf("O resultado da soma é: %.1f.", resultado);
			break;
		case 2:
			resultado = (num1 - num2);
			System.out.printf("O resultado da soma é: %.1f.", resultado);
			break;
		case 3:
			resultado = (num1 * num2);
			System.out.printf("O resultado da soma é: %.1f.", resultado);
			break;
		case 4:
			if (num2 == 0)
				System.out.println("Não existe divisão por zero!");
			resultado = (num1 / num2);
			System.out.printf("O resultado da soma é: %.1f.", resultado);
			break;
		default:
			System.out.println("Operação inválida!");
		}

	}

}
