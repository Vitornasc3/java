package aula_02;

import java.util.Scanner;

public class Ativ3 {
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Digite o salário bruto:");
		float salarioBruto = leia.nextFloat();
		System.out.println("Digite o adicional noturno:");
		float adicionalNoturno = leia.nextFloat();
		System.out.println("Digite as horas extras:");
		float horaExtra = leia.nextFloat();
		System.out.println("Digite o valor total dos descontos:");
		float descontos = leia.nextFloat();
		float salarioLiquido = (salarioBruto + adicionalNoturno + (horaExtra * 5) - descontos);

		System.out.printf("Valor do salário líquido é: %.2f.", salarioLiquido);

	}

}
