package persistence;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import uinterface.TelaPrincipal;

public class RegistroClientes {
	
	public RegistroClientes() {
	}
	
	public void registrar() throws IOException {
	File file = new File("Output");
	FileWriter arquivo = new FileWriter(file);
	String output = TelaPrincipal.getBar().pessoasEstiveramNoBar();
	arquivo.write(output);
	arquivo.close();
	}
	
}
