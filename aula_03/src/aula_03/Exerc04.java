package aula_03;

import java.util.Scanner;

public class Exerc04 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		String tipoAnimal, tipoAnimal2, tipoAnimal3;

		System.out.println("Digite uma das opções: vertebrado | invertebrado: ");
		tipoAnimal = leia.nextLine();

		if (tipoAnimal.equalsIgnoreCase("vertebrado")) {
			System.out.println("Digite uma das opções: ave | mamífero ");
			tipoAnimal2 = leia.nextLine();
			if (tipoAnimal2.equalsIgnoreCase("ave")) {
				System.out.println("Digite uma entre as opções: carnívoro | onívoro");
				tipoAnimal3 = leia.nextLine();
				if (tipoAnimal3.equalsIgnoreCase("carnívoro")) {
					System.out.println("O resultado é Águia!");
				} else {
					System.out.println("O resultado é Pomba!");
				}
			} else {
				System.out.println("Digite uma entre as opções: onívoro | herbívoro");
				tipoAnimal3 = leia.nextLine();
				if (tipoAnimal3.equalsIgnoreCase("onívoro")) {
					System.out.println("O resultado é Homem!");
				} else {
					System.out.println("O resultado é vaca!");
				}
			}

		} else {
			System.out.println("Digite uma das opções: Inseto | Anelídeo ");
			tipoAnimal2 = leia.nextLine();
			if (tipoAnimal2.equalsIgnoreCase("inseto")) {
				System.out.println("Digite uma entre as opções: hematófago | herbívoro");
				tipoAnimal3 = leia.nextLine();
				if (tipoAnimal3.equalsIgnoreCase("hematófago")) {
					System.out.println("O resultado é Pulga!");
				} else {
					System.out.println("O resultado é Lagarta!");
				}
			} else {
				System.out.println("Digite uma entre as opções: hematófago | onívoro");
				tipoAnimal3 = leia.nextLine();
				if (tipoAnimal3.equalsIgnoreCase("hematófago")) {
					System.out.println("O resultado é Sanguessuga!");
				} else {
					System.out.println("O resultado é minhoca!");
				}
			}

		}

	}

}
