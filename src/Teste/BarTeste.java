package Teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import common.Bar;
import common.Cliente;
import common.Socio;

public class BarTeste {
	Bar bar;

	@Test
	public void verificaEstaNoBar() {
		bar = new Bar();
		Socio socio = new Socio("Maria", "fem", 15646046, 44, 9879701);
		bar.registraSocio(socio);
		assertEquals(true, bar.estaNoBar(15646046));
	}
	
	@Test
	public void verificaNaoEstaNoBar() {
		bar = new Bar();
		assertEquals(false, bar.estaNoBar(15646046));
	}

	@Test
	public void verificaQuantidadePessoasNoBar() {
		bar = new Bar();
		Socio socio = new Socio("Maria", "fem", 15646046, 44, 9879701);
		Cliente cliente = new Cliente("Marcos", "Masc", 51489046, 41);
		bar.registraSocio(socio);
		bar.registraCliente(cliente);
		assertEquals(2, bar.quantidadePessoasNoBar());
	}

	@Test
	public void verificaNumPessoasPorGenero() {
		bar = new Bar();
		Socio socio = new Socio("Maria", "fem", 15646046, 44, 9879701);
		Cliente cliente = new Cliente("Marcos", "Masc", 51489046, 41);
		bar.registraSocio(socio);
		bar.registraCliente(cliente);
		assertEquals("Homens: 50%\n Mulheres: 50%", bar.numPessoasPorGenero());
	}
	
	@Test
	public void verificapessoasNoBar() {
		bar = new Bar();
		Socio socio = new Socio("Maria", "Fem", 15646046, 44, 9879701);
		Cliente cliente = new Cliente("Marcos", "Masc", 51489046, 41);
		bar.registraCliente(socio);
		bar.registraCliente(cliente);
		assertEquals("Maria\nMarcos\n", bar.pessoasNoBar());
	}
}