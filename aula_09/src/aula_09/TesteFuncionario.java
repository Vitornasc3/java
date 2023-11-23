package aula_09;

public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente g1 = new Gerente("Maria", 1, 20000.00f, 1000f);
		System.out.println("Salário calculado: " + g1.calcularSalario());

		Vendedor v1 = new Vendedor("Bryan", 2, 5000.0f, 0.10f);
		System.out.println("Salário calculado: " + v1.calcularSalario());
		
		Temporario t1 = new Temporario("Gercidio", 3, 2000.0f);
		t1.visualizar();
	}

}
