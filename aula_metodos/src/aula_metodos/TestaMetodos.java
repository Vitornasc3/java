package aula_metodos;

import static aula_metodos.pacote01.Classe02.*;

public class TestaMetodos {

	public static void main(String[] args) {
		
		//Chamadas para os métodos locais
		
		metodoPublico();		
		metodoFriendly();		
		metodoProtegido();		
		metodoPrivado();
		
		//Chamadas para os métodos da Classe 01
		
		Classe01.metodoPublico01();
		Classe01.metodoFriendly01();
		Classe01.metodoProtegido01();
		//Classe01.metodoPrivado01(); Só pode ser usado dentro da própria classe
		
		//Chamadas para os métodos da Classe 02 - Pacote 01
		
		metodoPublico02();
		//metodoFriendly02();
		//metodoProtegido02(); Somente funcionaria se tratando de uma herança
		//metodoPrivado02();
	}
	
	public static void metodoPublico() {
		System.out.println("Método público");
	}
	
	static void metodoFriendly() {
		System.out.println("Método friendly");
	}
	
	protected static void metodoProtegido() {
		System.out.println("Método protegido");
	}
	
	private static void metodoPrivado() {
		System.out.println("Método privado");
	}

}
