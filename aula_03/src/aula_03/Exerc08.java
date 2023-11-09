package aula_03;

import java.util.Scanner;

public class Exerc08 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;
		float saldo = 1000f, novoSaldo, transacao;

		System.out.println("Bem vindo ao banco! Digite a opção desejada dentre as seguintes:"
				+ "\n1 - Saldo\n2 - Saque\n3 - Deposito");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.printf("Saldo: %.2f", saldo);
			break;
		case 2:
			System.out.printf("Saldo de: %.2f, insira valor do saque:", saldo);
			transacao = leia.nextFloat();
			if (transacao <= saldo) {
				novoSaldo = (saldo - transacao);
				System.out.printf("Operação efetuada.\nSaldo atual: %.2f", novoSaldo);
			} else {
				System.out.println("Saldo insuficiente!");
			}
			break;
		case 3:
			System.out.println("Insira valor do depósito: ");
			transacao = leia.nextFloat();
			if (transacao > 0) {
				novoSaldo = (saldo + transacao);
				System.out.printf("Operação efetuada\nSaldo atual: %.2f ", novoSaldo);
			}
			break;
		default:
			System.out.println("Opção inválida!");

		}

	}

}
