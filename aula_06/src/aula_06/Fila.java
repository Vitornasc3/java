package aula_06;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		fila.add("Aline");
		fila.add("Pedro");
		fila.add("Vinicius");
		fila.add("Luiza");
		fila.add("Maria");

		System.out.println(fila);

		fila.remove();
		System.out.println(fila);

		System.out.println(fila.peek()); //checa o primeiro da fila

		System.out.println(fila);

		System.out.println(fila.poll()); //seleciona e remove o primeiro da fila

		System.out.println(fila);

		System.out.println("A maria está na fila? " + fila.contains("Maria")); //confere se o elemento está na fila

		System.out.println("Número de elementos na fila: " + fila.size());

		int contador = 0; // método criado para checar a posição do elemento na fila
		for (var posicao : fila) {
			contador++;
			if (posicao.equalsIgnoreCase("Maria"))
				System.out.println("Sua posição na fila é: " + contador);

		}
	}
}
