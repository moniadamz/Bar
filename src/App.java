
public class App {
	public static void main(String[] args) {
		Bar bar = new Bar();
	//(String nome, String genero, int cpf, int idade)
		Cliente a = new Cliente("monica", "fem", 5646874, 23);
		Socio b = new Socio("Lucas", "masc", 458485464, 23, 5304864);
		
		bar.registraCliente(a);
		bar.registraCliente(b);
		
		System.out.println(bar.pessoasNoBar());
		System.out.println(bar.quantidadePessoasNoBar());
		System.out.println(bar.estaNoBar(458485464));
		System.out.println(bar.numPessoasPorGenero());
	}
}
