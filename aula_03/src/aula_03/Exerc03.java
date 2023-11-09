package aula_03;

import java.util.Scanner;

public class Exerc03 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		String nome;
		int idade;
		boolean primeiraVez;

		System.out.println("Sistema de doação de sangue!");
		System.out.print("Por favor, digite o nome do doador: ");
		nome = leia.nextLine();
		System.out.print("Agora digite sua idade: ");
		idade = leia.nextInt();
		System.out.println("É a primeira vez doando?(true/false)");
		primeiraVez = leia.nextBoolean();

		if (idade >= 18 && idade < 60)
			System.out.printf("%s, você está apto(a) a doar!", nome);
		else if (idade >= 60 && idade <= 69 && primeiraVez == false)
			System.out.printf("%s, você está apto(a) a doar!", nome);
		else
			System.out.printf("%s, você está inapto(a) a doar.", nome);
	}

}
