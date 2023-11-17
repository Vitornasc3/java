package exerc01.model;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Vitor", 22, "Rua Nagoiashi", "5-555-2458", 1);
		c1.visualizar();
		
		Cliente c2 = new Cliente("Roberta", 26, "Rua Hiroshima", "5-555-3214", 2);
		c2.visualizar();

	}

}
