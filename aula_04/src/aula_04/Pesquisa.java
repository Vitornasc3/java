package aula_04;

import java.util.Scanner;

public class Pesquisa {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int idade, esporte, fut = 0, volMaior = 0, basqMenor = 0, outros = 0;
		String continua = "S";

		while (continua.equalsIgnoreCase("S")) {
		
			System.out.println("Digite sua idade:");
			idade = leia.nextInt();

			do {
				System.out.println("Digite seu esporte favorito:(1 - Futebol | 2 - Volei | 3 - Basquete | 4 - Outro:)");
				esporte = leia.nextInt();
				if (esporte < 1 || esporte > 4) {
					System.out.println("Opção inválida!");
				}
			} while (esporte < 1 || esporte > 4);

			if (esporte == 1)
				fut++;

			if (esporte == 2 && idade > 18)
				volMaior++;

			if (esporte == 3 && idade < 18)
				basqMenor++;

			if (esporte == 4)
				outros++;

			System.out.println("Deseja continuar? (S/N)");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
		} 

		System.out.println("Total de pessoas que gostam de futebol: " + fut);
		System.out.println("Total de pessoas que gostam de voleibol e são maiores de 18 anos: " + volMaior);
		System.out.println("Total de pessoas que gostam de basquetebol e são menores de 18 anos: " + basqMenor);
		System.out.println("Total de pessoas que gostam de outros esportes: " + outros);
	}

}
