package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import business.Socio;

public class SocioTeste {

	Socio socio;

	@Test
	public void retornaNome() {
		socio = new Socio("Maria", "Fem", 15646046, 44, 9879701);
		assertEquals("Maria", socio.getNome());
	}

	@Test
	public void retornaIdade() {
		socio = new Socio("Maria", "Fem", 15646046, 44, 9879701);
		assertEquals(44, socio.getIdade());
	}

	@Test
	public void retornaGenero() {
		socio = new Socio("Maria", "Fem", 15646046, 44, 9879701);
		assertEquals("Fem", socio.getGenero());
	}

	@Test
	public void retornaCpf() {
		socio = new Socio("Maria", "Fem", 15646046, 44, 9879701);
		assertEquals(15646046, socio.getCpf());
	}

	@Test
	public void retornaCodigoSocio() {
		socio = new Socio("Maria", "Fem", 15646046, 44, 9879701);
		assertEquals(9879701, socio.getNumSocio());
	}
	
	@Test
	public void retornaMilhagens() {
		socio = new Socio("Maria", "Fem", 15646046, 44, 9879701);
		socio.setMilhagens(2221);
		assertEquals(2221, socio.getMilhagens());
	}
}
