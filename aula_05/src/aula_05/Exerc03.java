package aula_05;

import java.util.Scanner;

public class Exerc03 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int somaP = 0, somaS = 0;
		String diagonalP = "", diagonalS = "";

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite os números da posição (" + i + "," + j + ")");
				matriz[i][j] = leia.nextInt();
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			diagonalP += matriz[i][i] + " ";
			somaP += matriz[i][i];
		}
		for (int i = 0; i < matriz.length; i++) {
			diagonalS += matriz[i][matriz[i].length - 1 - i] + " ";
			somaS += matriz[i][matriz.length - 1 - i];

		}
		System.out.print("Elementos da diagonal primária: " + diagonalP + "\n");
		System.out.print("Elementos da diagonal secundária: " + diagonalS + "\n");
		System.out.println("Soma dos elementos da diagonal primária: " + somaP);
		System.out.println("Soma dos elementos da diagonal secundária: " + somaS);
	}
}
