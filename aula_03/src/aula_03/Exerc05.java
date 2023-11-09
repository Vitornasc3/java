package aula_03;

import java.util.Scanner;

public class Exerc05 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int item, quantidade;
		double conta;

		System.out.println(" ---------- Cardápio ----------\n" + "\n1 - Cachorro Quente ----- R$10,00\n"
				+ "2 - X-Salada ------------ R$15,00\n" + "3 - X-Bacon ------------- R$18,00\n"
				+ "4 - Bauru --------------- R$12,00\n" + "5 - Refrigerante -------- R$8,00\n"
				+ "6 - Suco de laranja ----- R$13,00\n" + "\nDigite o código de um dos produtos:");
		item = leia.nextInt();
		switch (item) {
		case 1:
			System.out.println("Digita a quantidade: ");
			quantidade = leia.nextInt();
			conta = quantidade * 10;
			System.out.println("Produto: Cachorro quente");
			System.out.printf("Quantidade: %d \n", quantidade);
			System.out.printf("Valor total: R$%.2f", conta);
			break;
		case 2:
			System.out.println("Digita a quantidade: ");
			quantidade = leia.nextInt();
			conta = quantidade * 15;
			System.out.println("Produto: X-Salada");
			System.out.printf("Quantidade: %d \n", quantidade);
			System.out.printf("Valor total: R$%.2f", conta);
			break;
		case 3:
			System.out.println("Digita a quantidade: ");
			quantidade = leia.nextInt();
			conta = quantidade * 18;
			System.out.println("Produto: X-Bacon");
			System.out.printf("Quantidade: %d \n", quantidade);
			System.out.printf("Valor total: R$%.2f", conta);
			break;
		case 4:
			System.out.println("Digita a quantidade: ");
			quantidade = leia.nextInt();
			conta = quantidade * 12;
			System.out.println("Produto: Bauru");
			System.out.printf("Quantidade: %d \n", quantidade);
			System.out.printf("Valor total: R$%.2f", conta);
			break;
		case 5:
			System.out.println("Digita a quantidade: ");
			quantidade = leia.nextInt();
			conta = quantidade * 8;
			System.out.println("Produto: Refrigerante");
			System.out.printf("Quantidade: %d \n", quantidade);
			System.out.printf("Valor total: R$%.2f", conta);
			break;
		case 6:
			System.out.println("Digita a quantidade: ");
			quantidade = leia.nextInt();
			conta = quantidade * 13;
			System.out.println("Produto: Suco de laranja");
			System.out.printf("Quantidade: %d \n", quantidade);
			System.out.printf("Valor total: R$%.2f", conta);
			break;
		default:
			System.out.println("Digita um item válido");
		}
	}

}
