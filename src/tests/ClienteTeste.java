package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import business.Cliente;

class ClienteTeste {
	Cliente cliente;

	
	@Test
	public void retornaNome() {
		cliente = new Cliente("Maria", "Fem", 15646046, 44);
		assertEquals("Maria", cliente.getNome());
	}
	
	@Test
	public void retornaIdade() {
		cliente = new Cliente("Maria", "Fem", 15646046, 44);
		assertEquals(44, cliente.getIdade());
	}
	
	@Test
	public void retornaGenero() {
		cliente = new Cliente("Maria", "Fem", 15646046, 44);
		assertEquals("Fem", cliente.getGenero());
	}
	
	@Test
	public void retornaCpf() {
		cliente = new Cliente("Maria", "Fem", 15646046, 44);
		assertEquals(15646046, cliente.getCpf());
	}
}
