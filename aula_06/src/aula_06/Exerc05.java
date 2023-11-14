package aula_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exerc05 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Queue<String> clientes = new LinkedList<String>();
		Integer opcao = 1;

		System.out.println("***************************************************");
		System.out.println("\n	1 - Adicionar clientes na fila");
		System.out.println("	2 - Listar todos os clientes");
		System.out.println("	3 - Retirar cliente da fila");
		System.out.println("	0 - Sair");
		System.out.println("\n***************************************************");

		while (opcao != 0) {

			System.out.print("\nInsira a opção desejada: ");
			opcao = leia.nextInt();
			leia.skip("\\R");
			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome: ");
				clientes.add(leia.nextLine());
				System.out.println("\n--- Fila --- \n");
				clientes.forEach(System.out::println);
				System.out.println("\nCliente Adicionado!\n");
				break;

			case 2:
				if (clientes.isEmpty())
					System.out.println("\nFila vazia!\n");
				else
					System.out.println("\n--- Fila --- \n");
				clientes.forEach(System.out::println);
				break;

			case 3:
				if (clientes.isEmpty())
					System.out.println("\nFila vazia!\n");
				else {
					System.out.printf("\nO cliente %s foi chamado!\n", clientes.poll());
					System.out.println("\n--- Fila ---\n");
					clientes.forEach(System.out::println);
				}
				break;

			case 0:
				System.out.println("Programa encerrado!");
				break;

			default:
				System.out.println("Insira opção válida!");
				break;

			}
		}
	}
}
