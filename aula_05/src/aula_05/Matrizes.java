package aula_05;

import java.util.Scanner;

public class Matrizes {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		//int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] matrizIrregular = { { 1, 2, 3 }, { 4, 5, 6, } };

		//double[][] matrizDouble = new double[3][3];

		/*
		 * for (int i = 0; i < matriz.length; i++) for (int j = 0; j < matriz.length;
		 * j++) { System.out.printf("Matriz [%d][%d] = %d\n", i, j, matriz[i][j]); }
		 * 
		 * for (int i = 0; i < matrizDouble.length; i++) for (int j = 0; j <
		 * matrizDouble.length; j++) { System.out.printf("Matriz [%d][%d] = \n", i, j);
		 * matrizDouble[i][j] = leia.nextDouble(); }
		 * 
		 * for (int i = 0; i < matrizDouble.length; i++) for (int j = 0; j <
		 * matrizDouble.length; j++) { System.out.printf("Matriz [%d][%d] = %d \n", i,
		 * j, matriz[i][j]); }
		 */

		for (int i = 0; i < matrizIrregular.length; i++) { // No caso de matriz irregular, passar a linha como parâmetro
															// no segundo loop
			for (int j = 0; j < matrizIrregular[i].length; j++) {
				System.out.printf("Matriz [%d][%d] = %d\n", i, j, matrizIrregular[i][j]);
			}
		}
		for (int[] vetor : matrizIrregular) { //estrutura correta para for each lidando com matrizes
			for (int elemento : vetor) {
				System.out.println(elemento);
			}
		}
	}
}
