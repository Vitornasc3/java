package aula_06;

import java.util.Scanner;
import java.util.Stack;

public class Exerc06 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		Stack<String> livros = new Stack<String>();
		Integer opcao = 1;

		while (opcao != 0) {
			
			System.out.println("***************************************************");
			System.out.println("\n	1 - Adicionar livro na pilha");
			System.out.println("	2 - Listar todos os livros");
			System.out.println("	3 - Retirar livro da pilha");
			System.out.println("	0 - Sair");
			System.out.println("\n***************************************************");

			System.out.print("\nInsira a opção desejada: ");
			opcao = leia.nextInt();
			leia.skip("\\R");
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro: ");
				livros.push(leia.nextLine());
				System.out.println("\n--- Pilha --- \n");
				livros.forEach(System.out::println);
				System.out.println("\nLivro Adicionado!\n");
				break;

			case 2:
				if (livros.isEmpty())
					System.out.println("\nPilha vazia!\n");
				else
					System.out.println("\n--- Pilha --- \n");
				livros.forEach(System.out::println);
				break;

			case 3:
				if (livros.isEmpty())
					System.out.println("\nPilha vazia!\n");
				else {
					System.out.printf("\nO Livro %s foi removido!\n", livros.pop());
					System.out.println("\n--- Pilha ---\n");
					livros.forEach(System.out::println);
					
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

		
