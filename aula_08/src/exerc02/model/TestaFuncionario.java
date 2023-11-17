package exerc02.model;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Fabio","Gerente", 1, "555-7804-234", "fabio@banconagoya.com");
		f1.visualizar();
		
		Funcionario f2 = new Funcionario("Clara","CEO", 2, "555-1245-774", "clara@banconagoya.com");
		f2.visualizar();
		
	}

}
