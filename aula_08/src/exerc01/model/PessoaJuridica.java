package exerc01.model;

public class PessoaJuridica extends Cliente{
	
	private String nomeFantasia;
	private String cnpj;

	public PessoaJuridica(String nome, int idade, String endereço, String tel, int sexo, String nomeFantasia,
			String cnpj) {
		super(nome, idade, endereço, tel, sexo);
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nome fantasia: " + this.getNomeFantasia());
		System.out.println("CNPJ: " + this.getCnpj());
	}

}
