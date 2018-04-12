package persistence;

import java.io.FileWriter;
import java.io.IOException;

import business.Bar;

import java.io.File;

public class RegistroClientes extends Bar {

	public RegistroClientes() throws IOException {
		registra();
	}

	public void registra() throws IOException {
		FileWriter arquivo = new FileWriter(new File("src/registroClientes.txt"));
		String msg = estiveramNoBar();
		arquivo.write(msg);
		arquivo.close();
	}
}