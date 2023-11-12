package aula_03;

import java.util.Scanner;

public class Exerc05 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int item, quantidade = 0;
		String produto = "0";
		double conta = 0;

		System.out.println(" ---------- Cardápio ----------\n" + "\n1 - Cachorro Quente ----- R$10,00\n"
				+ "2 - X-Salada ------------ R$15,00\n" + "3 - X-Bacon ------------- R$18,00\n"
				+ "4 - Bauru --------------- R$12,00\n" + "5 - Refrigerante -------- R$8,00\n"
				+ "6 - Suco de laranja ----- R$13,00\n" + "\nDigite o código de um dos produtos:");
		item = leia.nextInt();
		
		System.out.println("Digita a quantidade: ");
		quantidade = leia.nextInt();
		
		switch (item) {
		case 1:
			produto = "Cachorro quente";
			conta = quantidade * 10;
			break;
		case 2:
			produto = "X-Salada";
			conta = quantidade * 15;
			break;
		case 3:
			produto = "X-Bacon";
			conta = quantidade * 18;
			break;
		case 4:
			produto = "Bauru";
			conta = quantidade * 12;
			break;
		case 5:
			produto = "Refrigerante";
			conta = quantidade * 8;
			break;
		case 6:
			produto = "Suco de laranja";
			conta = quantidade * 13;
			break;
		default:
			System.out.println("Digita um item válido");
		}
		System.out.printf("Produto: %s \n" , produto);
		System.out.printf("Quantidade: %d \n", quantidade);
		System.out.printf("Valor total: R$%.2f", conta);
	}
}
