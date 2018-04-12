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
	
	public String estiveramNoBar() {
		String lista = "";
		for (Cliente c : clientesNoBar) {
			lista += c.getNome() + "\n";
		}
		return lista;
	}

	public int quantidadePessoasNoBar() {
		return clientesNoBar.size();
	}

	public String getCliente(int cpf) {
		String cliente = "";
		for (Cliente c : clientesNoBar) {
			if (c.getCpf() == cpf) {
				cliente = "Nome: " + c.getNome() + "\nG�nero: " + c.getGenero() + "\nIdade: " + c.getIdade();
				return cliente;
			}
		}
		return cliente;
	}

	public int numMulheresNoBar() {
		int mulheres = 0;
		for (Cliente c : clientesNoBar) {
			if (c.getGenero().equals("Feminino")) {
				mulheres++;
			}
		}
		return mulheres;
	}

	public int numHomensNoBar() {
		int homens = 0;
		for (Cliente c : clientesNoBar) {
			if (c.getGenero().equals("Masculino")) {
				homens++;
			}
		}
		return homens;
	}

}
