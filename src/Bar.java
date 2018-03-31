import java.util.ArrayList;

public class Bar {
	ArrayList<Cliente> clientes;
	ArrayList<Socio> socios;

	public Bar() {
		clientes = new ArrayList<>();
		socios = new ArrayList<>();
	}

	public void registraCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void registraSocio(Socio socio) {
		socios.add(socio);
	}

	public String pessoasNoBar() {
		String lista = "";
		for (Cliente c : clientes) {
			lista += c.getNome() + "\n";
		}
		return lista;
	}

	public int quantidadePessoasNoBar() {
		return socios.size() + clientes.size();
	}

	public boolean estaNoBar(int cpf) {
		for (Cliente c : clientes) {
			if (c.getCpf() == cpf) {
				return true;
			}
		}
		return false;
	}
	
	public String numPessoasPorGenero() {
		int homens = 0;
		int mulheres = 0;
		for (Cliente c : clientes) {
			if(c.getGenero() == "fem") {
				mulheres ++;
			} else {
				homens++;
			}
		}
		return "Homens: " + (homens * 100) / clientes.size()  + "%\nMulheres: " + (mulheres * 100) / clientes.size() + "%";
	}

}
