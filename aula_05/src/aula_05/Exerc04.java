package aula_05;

import java.util.Scanner;

public class Exerc04 {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		float[][] boletim = new float[10][4];
		float[] medias = new float[10];
		float soma = 0.0f;

		for (int i = 0; i < boletim.length; i++) {
			for (int j = 0; j < boletim[i].length; j++) {
				System.out.println("Insina a " + (j + 1) + "ª nota do participante " + (i + 1) + ": ");
				boletim[i][j] = leia.nextFloat();
			}

		}
		for (int i = 0; i < boletim.length; i++) {
			for (int j = 0; j < boletim[i].length; j++) {
				soma += boletim[i][j];
			}
			medias[i] = soma / boletim[i].length;
			soma = 0.0f;
		}

		for (int i = 0; i < medias.length; i++)
			System.out.println("A média do aluno " + (i + 1) + " é: " + medias[i]);
	}

}
