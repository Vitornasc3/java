package aula_04;

import java.util.Scanner;

public class Exerc03 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int idade = 0, menorIdade = 0, maiorIdade = 0;
		while (idade >= 0) {
			System.out.println("Insira sua idade: ");
			idade = leia.nextInt();
			if (idade < 21 && idade > 0) {
				menorIdade++;
			} else if (idade > 50) {
				maiorIdade++;
			}
		}

		System.out.println("Total de pessoas menores de 21 anos: " + menorIdade);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + maiorIdade);
	}

}
