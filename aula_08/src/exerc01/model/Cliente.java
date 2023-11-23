package exerc01.model;

public class Cliente {

	private String nome;
	private int idade;
	private String endereço;
	private String tel;
	private int sexo;

	public Cliente(String nome, int idade, String endereço, String tel, int sexo) {
		this.nome = nome;
		this.idade = idade;
		this.endereço = endereço;
		this.tel = tel;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	
	public void visualizar() {
		
		String sexo = "";
		
		switch(this.sexo) {
		case 1 -> sexo = "Masculino";
		case 2 -> sexo = "Feminino";
		}
		
		System.out.println("-----------------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Endereço: " + this.getEndereço());
		System.out.println("Tel: " + this.getTel());
		
	}

}
