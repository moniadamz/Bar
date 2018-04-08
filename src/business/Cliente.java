package business;

public class Cliente {
	private String nome, genero;
	private int cpf;
	private int idade;

	public Cliente(String nome, String genero, int cpf, int idade) {
		this.nome = nome;
		this.genero = genero;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public int getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}

}
