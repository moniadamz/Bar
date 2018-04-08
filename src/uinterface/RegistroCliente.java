package uinterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import business.Cliente;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

@SuppressWarnings("serial")
public class RegistroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField cpf;
	private JTextField idade;
	private JComboBox<String> genero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroCliente frame = new RegistroCliente();
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
	public RegistroCliente() {
		setTitle("Registrar Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 279);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(24, 21, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("G\u00EAnero:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(24, 58, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CPF:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(24, 96, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Idade:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(24, 132, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		nome = new JTextField();
		nome.setBounds(80, 19, 200, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		cpf = new JTextField();
		cpf.setBounds(80, 94, 120, 20);
		contentPane.add(cpf);
		cpf.setColumns(10);
		
		idade = new JTextField();
		idade.setBounds(80, 130, 89, 20);
		contentPane.add(idade);
		idade.setColumns(10);
		String[] generos = {"Feminino", "Masculino"};
		genero = new JComboBox<String>(generos);
		genero.setFont(new Font("Tahoma", Font.PLAIN, 12));
		genero.setBounds(80, 56, 120, 20);
		contentPane.add(genero);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int _cpf = Integer.parseInt(cpf.getText());
				int _idade = Integer.parseInt(idade.getText());
				String _genero = genero.getSelectedItem().toString(); 
				Cliente cliente = new Cliente(nome.getText(),_genero,_cpf,_idade);
				TelaPrincipal.getBar().registraCliente(cliente);
				dispose();
			}
		});
		btnRegistrar.setBounds(136, 188, 89, 23);
		contentPane.add(btnRegistrar);
		
		
	}

}
