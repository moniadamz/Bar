package uinterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;

@SuppressWarnings("serial")
public class PesquisarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField cpf;
	private JTextArea exibir;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PesquisarCliente frame = new PesquisarCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PesquisarCliente() {
		setTitle("Pesquisar Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 387, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInserirCpf = new JLabel("Insira o CPF:");
		lblInserirCpf.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblInserirCpf.setBounds(22, 11, 73, 31);
		contentPane.add(lblInserirCpf);
		
		cpf = new JTextField();
		cpf.setBounds(98, 17, 128, 20);
		contentPane.add(cpf);
		cpf.setColumns(10);
		
		exibir = new JTextArea();
		exibir.setBounds(22, 53, 322, 157);
		contentPane.add(exibir);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			int _cpf = Integer.parseInt(cpf.getText()); 
				String info = TelaPrincipal.getBar().getCliente(_cpf);
				exibir.setText(info);
			}
		});
		btnPesquisar.setBounds(236, 15, 108, 23);
		contentPane.add(btnPesquisar);
		
		JButton btnListarTodosOs = new JButton("Listar todos os clientes");
		btnListarTodosOs.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnListarTodosOs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				exibir.setText(TelaPrincipal.getBar().pessoasNoBar());
			}
		});
		btnListarTodosOs.setBounds(32, 221, 204, 23);
		contentPane.add(btnListarTodosOs);
		
		
	}
}
