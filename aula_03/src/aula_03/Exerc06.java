package aula_03;

import java.util.Scanner;

public class Exerc06 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		String nome;
		int codigo;
		float salario, novoSalario;

		System.out.print("Digite o nome do funcionário: ");
		nome = leia.nextLine();

		System.out.println("Selecione o código do cargo:\n1 - Gerente\n2 - Vendedor\n3 - Supervisor\n"
				+ "4 - Motorista\n5 - Estoquista\n6 - Técnico de TI");
		codigo = leia.nextInt();

		System.out.print("Digite o salário do funcionário: ");
		salario = leia.nextFloat();

		switch (codigo) {
		case 1:
			novoSalario = (salario + (salario * 0.1f));
			System.out.printf("Colaborador: %s\nCargo: Gerente\nNovo salário: R$%.2f", nome, novoSalario);
			break;
		case 2:
			novoSalario = (salario + (salario * 0.07f));
			System.out.printf("Colaborador: %s\nCargo: Vendedor\nNovo salário: R$%.2f", nome, novoSalario);
			break;
		case 3:
			novoSalario = (salario + (salario * 0.09f));
			System.out.printf("Colaborador: %s\nCargo: Supervisor\nNovo salário: R$%.2f", nome, novoSalario);
			break;
		case 4:
			novoSalario = (salario + (salario * 0.06f));
			System.out.printf("Colaborador: %s\nCargo: Motorista\nNovo salário: R$%.2f", nome, novoSalario);
			break;
		case 5:
			novoSalario = (salario + (salario * 0.05f));
			System.out.printf("Colaborador: %s\nCargo: Estoquista\nNovo salário: R$%.2f", nome, novoSalario);
			break;
		case 6:
			novoSalario = (salario + (salario * 0.08f));
			System.out.printf("Colaborador: %s\nCargo: Técnico de TI\nNovo salário: R$%.2f", nome, novoSalario);
			break;
		default:
			System.out.println("Opção válida!");
		}

	}

}
