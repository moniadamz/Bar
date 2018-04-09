package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import business.Bar;
import business.Cliente;
import business.Socio;

public class BarTeste {
	Bar bar;

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