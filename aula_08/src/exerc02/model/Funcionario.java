package exerc02.model;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private int cadastro;
	private String tel;
	private String email;
	
	public Funcionario(String nome, String cargo, int cadastro, String tel, String email) {
		this.nome = nome;
		this.cargo = cargo;
		this.cadastro = cadastro;
		this.tel = tel;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void visualizar() {
		System.out.println("---------------------------------");
		System.out.println("Nome: " + this.getNome() );
		System.out.println("Cargo: " + this.getCargo() );
		System.out.println("Cadastro: " + this.getCadastro() );
		System.out.println("Tel: " + this.getTel() );
		System.out.println("Email: " + this.getEmail() );
		System.out.println("---------------------------------");
	}
	
	
}
