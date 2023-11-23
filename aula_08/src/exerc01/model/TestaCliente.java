package exerc01.model;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Vitor", 22, "Rua Nagoiashi", "5-555-2458", 1);
		c1.visualizar();
		
		Cliente c2 = new Cliente("Roberta", 26, "Rua Hiroshima", "5-555-3214", 2);
		c2.visualizar();
		
		PessoaFisica pf1 = new PessoaFisica("Vitoria", 21, "Rua das palmeiras", "5-555-1458", 2, "125.145.985-25");
		pf1.visualizar();
		
		PessoaJuridica pj1 = new PessoaJuridica("Rodrigo", 35, "Rua das Colinas", "5-555-5487", 1, "Digao Comercio de Alimentos LTDA", "45.487.248/0001-14");
		pj1.visualizar();

	}

}
