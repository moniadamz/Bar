package uinterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Relatorio extends JFrame {

	private JPanel contentPane;
	private JTextField mulheres;
	private JTextField homens;
	private JTextField noPessoas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Relatorio frame = new Relatorio();
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
	public Relatorio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 229, 202);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNoPessoas = new JLabel("Pessoas no bar:");
		lblNoPessoas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNoPessoas.setBounds(21, 21, 112, 22);
		contentPane.add(lblNoPessoas);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(21, 66, 46, 14);
		contentPane.add(label);
		
		JLabel lblMulheres = new JLabel("Mulheres:");
		lblMulheres.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMulheres.setBounds(21, 66, 112, 22);
		contentPane.add(lblMulheres);
		
		JLabel lblHomens = new JLabel("Homens:");
		lblHomens.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHomens.setBounds(21, 111, 112, 22);
		contentPane.add(lblHomens);
		
		mulheres = new JTextField();
		mulheres.setEditable(false);
		mulheres.setBounds(90, 68, 86, 20);
		contentPane.add(mulheres);
		mulheres.setColumns(10);
		String noMulheres = ""+ TelaPrincipal.getBar().numMulheresNoBar()+ "%";
		homens.setText(noMulheres);

		
		homens = new JTextField();
		homens.setEditable(false);
		homens.setBounds(90, 113, 86, 20);
		contentPane.add(homens);
		homens.setColumns(10);
		String noHomens = "" + TelaPrincipal.getBar().numHomensNoBar()+ "%";
		homens.setText(noHomens);
		
		noPessoas = new JTextField();
		noPessoas.setEditable(false);
		noPessoas.setBounds(113, 23, 63, 20);
		contentPane.add(noPessoas);
		noPessoas.setColumns(10);
		noPessoas.setText(""+ TelaPrincipal.getBar().quantidadePessoasNoBar());
	}

}
