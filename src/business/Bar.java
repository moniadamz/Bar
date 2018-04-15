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

	public String saidaCliente(int cpf) {
		String text = "";
		for (Cliente c : clientesNoBar) {
			if (c.getCpf() == cpf) {
				clientesNoBar.remove(c);
				text += "Concluído!";
				break;
			}
		}
		return text;
	}

	public String pessoasEstiveramNoBar() {
		String lista = "";
		for (Cliente c : esteveNoBar) {
			if (c instanceof Socio) {
				lista += "Nome: " + c.getNome() + ", CPF:" + c.getCpf() + ", nº Sócio: " + ((Socio) c).getNumSocio()
						+ "\n";
				continue;
			}
			if (c instanceof Cliente) {
				lista += "Nome: " + c.getNome() + ", CPF:" + c.getCpf() + "\n";
			}
		}
		return lista;
	}
	
	public String pessoasNoBar() {
		String lista = "";
		for (Cliente c : clientesNoBar) {
			if (c instanceof Socio) {
				lista += "Nome: " + c.getNome() + ", CPF:" + c.getCpf() + ", nº Sócio: " + ((Socio) c).getNumSocio()
						+ "\n";
				continue;
			}
			if (c instanceof Cliente) {
				lista += "Nome: " + c.getNome() + ", CPF:" + c.getCpf() + "\n";
			}
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
				if (c instanceof Socio) {
					cliente += "Nome: " + c.getNome() + ", CPF: " + c.getCpf() + ", nº Sócio: "
							+ ((Socio) c).getNumSocio();
					continue;
				}
				if (c instanceof Cliente) {
					cliente += "Nome: " + c.getNome() + ", CPF: " + c.getCpf();
				}
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
