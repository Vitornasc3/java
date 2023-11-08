package aula_02;

import java.util.Scanner;

public class Ativ1 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite o salário: ");
		float salario = leia.nextFloat();
		System.out.println("Digite o abono: ");
		float abono = leia.nextFloat();
		float novoSalario = (salario + abono);

		System.out.printf("Seu novo salário é: R$%.2f.", novoSalario);

	}
}
