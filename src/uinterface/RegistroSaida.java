package uinterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class RegistroSaida extends JFrame {

	private JPanel contentPane;
	private JTextField inserir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroSaida frame = new RegistroSaida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RegistroSaida() {
		setTitle("Registrar Sa\u00EDda");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 369, 131);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		inserir = new JTextField();
		inserir.setBounds(10, 26, 211, 20);
		contentPane.add(inserir);
		inserir.setColumns(10);

		JTextPane exibir = new JTextPane();
		exibir.setBounds(10, 56, 211, 20);
		contentPane.add(exibir);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int _cpf = Integer.parseInt(inserir.getText());
				String texto = TelaPrincipal.getBar().getCliente(_cpf);
				exibir.setText(texto);
			}
		});
		btnBuscar.setBounds(232, 25, 98, 23);
		contentPane.add(btnBuscar);

		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int _cpf = Integer.parseInt(inserir.getText());
				String text = TelaPrincipal.getBar().saidaCliente(_cpf);
				exibir.setText(text);
			}
		});
		btnCheckout.setBounds(232, 53, 98, 23);
		contentPane.add(btnCheckout);
	}
}
