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
		Socio socio = new Socio("Maria", "Feminino", 15646046, 44, 9879701);
		Cliente cliente = new Cliente("Marcos", "Masculino", 8299410, 41);
		bar.registraSocio(socio);
		bar.registraCliente(cliente);
		assertEquals(2, bar.quantidadePessoasNoBar());
	}
	
	@Test
	public void verificaPessoasNoBar() {
		bar = new Bar();
		Socio socio = new Socio("Maria", "Feminino", 15646046, 44, 9879701);
		Cliente cliente = new Cliente("Marcos", "Masculino", 98429494, 41);
		bar.registraSocio(socio);
		bar.registraCliente(cliente);
		assertEquals("Nome: Maria, CPF:15646046, nº Sócio: 9879701\nNome: Marcos, CPF:98429494\n", bar.pessoasNoBar());
	}

	@Test
	public void numMulheresNoBar() {
		bar = new Bar();
		Socio socio = new Socio("Maria", "Feminino", 15646046, 44, 9879701);
		bar.registraSocio(socio);
		assertEquals(1, bar.numMulheresNoBar());
	}
	
	@Test
	public void getCliente() {
		bar = new Bar();
		Socio socio = new Socio("Maria", "Feminino", 15646046, 44, 9879701);
		bar.registraSocio(socio);
		assertEquals("Nome: Maria, CPF: 15646046, nº Sócio: 9879701", bar.getCliente(15646046));
	}
	
	@Test
	public void saidaCliente(){
		bar = new Bar();
		Cliente cliente = new Cliente("Marcos", "Masculino", 98429494, 41);
		bar.registraCliente(cliente);
		assertEquals("Concluído!", bar.saidaCliente(98429494));
	}
	
	@Test
	public void numHomensNoBar() {
		bar = new Bar();
		Cliente cliente = new Cliente("Marcos", "Masculino", 98429494, 41);
		bar.registraCliente(cliente);
		assertEquals(1, bar.numHomensNoBar());
	}
}