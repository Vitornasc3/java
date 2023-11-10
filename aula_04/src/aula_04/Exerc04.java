package aula_04;

import java.util.Scanner;

public class Exerc04 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int genero, cargo, backend = 0, frontend = 0, fullstack = 0, mobile = 0, idade = 0, totalDePessoas = 0;
		float mediaIdade, totalIdade = 0f;
		String continuar = "S";

		while (continuar.equalsIgnoreCase("S")) {

			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

			System.out.println("Identifique seu gênero entre as opções abaixo:");
			System.out.println(
					"1- Mulher Cis | 2- Homem cis | 3- Não binário | 4- Mulher trans | 5- Homem trans | 6- Outros");
			genero = leia.nextInt();

			System.out.println("Escolha sua função dentre as opções abaixo:");
			System.out.println("1- Backend | 2- Frontend | 3- Mobile | 4- FullStack");
			cargo = leia.nextInt();

			totalDePessoas++;
			totalIdade = totalIdade + idade;

			if (cargo == 1)
				backend++;

			if ((genero == 1 || genero == 4) && cargo == 2)
				frontend++;

			if (((genero == 2 || genero == 5) && idade > 40) && cargo == 3)
				mobile++;

			if (genero == 4 && cargo == 1 && idade < 30)
				fullstack++;

			System.out.println("Deseja continuar? (S/N)");
			leia.skip("\\R");
			continuar = leia.nextLine();
		}

		mediaIdade = totalIdade / totalDePessoas;

		System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
		System.out.println("Total de mulheres cis e trans desenvolvedoras Frontend: " + frontend);
		System.out.println("Total de homens cis e trans desenvolvedores mobile maiores de 40 anos: " + mobile);
		System.out.println("Total de pessoas não binárias desenvolvedoras FullStack menores de 30 anos: " + fullstack);
		System.out.println("O numero total de pessoas que responderam a pesquisa: " + totalDePessoas);
		System.out.println("A média de idade das pessoas que responderam a pesquisa:" + mediaIdade);

	}

}
