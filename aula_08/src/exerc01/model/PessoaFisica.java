package exerc01.model;

public class PessoaFisica extends Cliente{
	
	private String cpf;

	public PessoaFisica(String nome, int idade, String endereço, String tel, int sexo, String cpf) {
		super(nome, idade, endereço, tel, sexo);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Cpf: " + getCpf());
	}

}
