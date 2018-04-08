package uinterface;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import business.Socio;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class RegistroSocio extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField cpf;
	private JTextField idade;
	private JLabel lblNsocio;
	private JTextField noSocio;
	private JButton btnRegistrar;
	private JComboBox<String> genero;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroSocio frame = new RegistroSocio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistroSocio() {
		setTitle("Registrar S\u00F3cio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 276);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(24, 21, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblGenero = new JLabel("G\u00EAnero:");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGenero.setBounds(24, 55, 46, 20);
		contentPane.add(lblGenero);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCpf.setBounds(24, 96, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIdade.setBounds(24, 132, 46, 14);
		contentPane.add(lblIdade);
		
		nome = new JTextField();
		nome.setBounds(80, 19, 200, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		cpf = new JTextField();
		cpf.setBounds(79, 93, 121, 20);
		contentPane.add(cpf);
		cpf.setColumns(10);
		
		idade = new JTextField();
		idade.setBounds(80, 129, 89, 20);
		contentPane.add(idade);
		idade.setColumns(10);
		
		lblNsocio = new JLabel("N\u00BA S\u00F3cio:");
		lblNsocio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNsocio.setBounds(210, 95, 59, 17);
		contentPane.add(lblNsocio);
		
		noSocio = new JTextField();
		noSocio.setBounds(268, 93, 86, 20);
		contentPane.add(noSocio);
		noSocio.setColumns(10);
		
		genero = new JComboBox<String>();
		genero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		genero.addItem("Feminino");
		genero.addItem("Masculino");
		genero.setBounds(80, 55, 120, 20);
		contentPane.add(genero);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int _cpf = Integer.parseInt(cpf.getText());
				int _idade = Integer.parseInt(idade.getText());
				String _genero = genero.toString();
				int _noSocio = Integer.parseInt(noSocio.getText());
				Socio cliente = new Socio(nome.getText(),_genero,_cpf,_idade,_noSocio);
				TelaPrincipal.getBar().registraCliente(cliente);
				dispose();
			}
		});
		btnRegistrar.setBounds(152, 187, 89, 23);
		contentPane.add(btnRegistrar);
		
		
		
		
		
		

	}

}
