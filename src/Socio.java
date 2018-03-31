
public class Socio extends Cliente {
	private int numSocio;
	private int milhagens;
	
	public Socio(String nome, String genero, int cpf, int idade, int numSocio) {
		super(nome, genero, cpf, idade);
		this.numSocio = numSocio;
	}
	
	public void setMilhagens(int milhagens) {
		this.milhagens = milhagens;
	}

	public int getMilhagens() {
		return milhagens;
	}

	public int getNumSocio() {
		return numSocio;
	}
}
