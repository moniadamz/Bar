package business;
import java.util.ArrayList;

public class Bar {
	ArrayList<Cliente> clientesNoBar;
	ArrayList<Cliente> esteveNoBar;

	public Bar() {
		clientesNoBar = new ArrayList<>();
		esteveNoBar = new ArrayList<>();
	}
	
	public void registraCliente(Cliente cliente) {
		clientesNoBar.add(cliente);
		esteveNoBar.add(cliente);
	}

	public void registraSocio(Socio socio) {
		clientesNoBar.add(socio);
		esteveNoBar.add(socio);
	}

	public void saidaCliente(Cliente cliente) {
		clientesNoBar.remove(cliente);
	}
	
	public String pessoasNoBar() {
		String lista = "";
		for (Cliente c : clientesNoBar) {
			lista += c.getNome() + "\n";
		}
		return lista;
	}

	public int quantidadePessoasNoBar() {
		return clientesNoBar.size();
	}

	public boolean estaNoBar(int cpf) {
		for (Cliente c : clientesNoBar) {
			if (c.getCpf() == cpf) {
				return true;
			}
		}
		return false;
	}
	
	public String numPessoasPorGenero() {
		int homens = 0;
		int mulheres = 0;
		for (Cliente c : clientesNoBar) {
			if(c.getGenero() == "fem") {
				mulheres ++;
			} else {
				homens++;
			}
		}
		return "Homens: " + (homens * 100) / clientesNoBar.size()  + "%\n Mulheres: " + (mulheres * 100) / clientesNoBar.size() + "%";
	}

}
