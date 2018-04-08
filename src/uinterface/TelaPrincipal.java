package uinterface;

import java.awt.EventQueue;

import javax.swing.JFrame;

import business.Bar;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TelaPrincipal {

	private JFrame frame;
	private static Bar bar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		bar = new Bar();
		initialize();
		
		
	}
	
	public static Bar getBar(){
		return bar;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 355, 264);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton RegistrarCliente = new JButton("Registrar Cliente");
		RegistrarCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RegistrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroCliente rc = new RegistroCliente();
				rc.setVisible(true);
			}
		});
		RegistrarCliente.setBounds(95, 63, 146, 23);
		frame.getContentPane().add(RegistrarCliente);
		
		JButton PesquisarCliente = new JButton("Pesquisar Cliente");
		PesquisarCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		PesquisarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PesquisarCliente pc = new PesquisarCliente();
				pc.setVisible(true);
			}
		});
		PesquisarCliente.setBounds(96, 29, 145, 23);
		frame.getContentPane().add(PesquisarCliente);
		
		JButton RegistrarSocio = new JButton("Registrar Sócio");
		RegistrarSocio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		RegistrarSocio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroSocio rs = new RegistroSocio();
				rs.setVisible(true);
			}
		});
		RegistrarSocio.setBounds(95, 97, 146, 23);
		frame.getContentPane().add(RegistrarSocio);
		
		JButton btnRelatorio = new JButton("Relatório");
		btnRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Relatorio rl = new Relatorio();
			rl.setVisible(true);
			}
		});
		btnRelatorio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRelatorio.setBounds(95, 131, 146, 23);
		frame.getContentPane().add(btnRelatorio);
	}

}
