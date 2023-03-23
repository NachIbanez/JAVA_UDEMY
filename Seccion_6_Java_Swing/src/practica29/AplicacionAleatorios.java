package practica29;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;

public class AplicacionAleatorios extends JFrame {

	private JPanel contentPane;
	private JTextField txtAleatorio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacionAleatorios frame = new AplicacionAleatorios();
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
	public AplicacionAleatorios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Generador números aleatorios");
		lblTitulo.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblTitulo.setBounds(130, 0, 294, 57);
		contentPane.add(lblTitulo);
		
		JSpinner spMin = new JSpinner();
		spMin.setBounds(205, 67, 62, 20);
		contentPane.add(spMin);
		
		JSpinner spMax = new JSpinner();
		spMax.setBounds(322, 67, 54, 20);
		contentPane.add(spMax);
		
		JLabel lblMin = new JLabel("Min");
		lblMin.setBounds(174, 70, 21, 13);
		contentPane.add(lblMin);
		
		JLabel lblMax = new JLabel("Max");
		lblMax.setBounds(292, 70, 29, 13);
		contentPane.add(lblMax);
		
		txtAleatorio = new JTextField();
		txtAleatorio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtAleatorio.setBounds(262, 170, 128, 19);
		contentPane.add(txtAleatorio);
		txtAleatorio.setColumns(10);
		
		JLabel lblNumeroAleatorio = new JLabel("Numero Aleatorio Generado");
		lblNumeroAleatorio.setBounds(262, 147, 138, 13);
		contentPane.add(lblNumeroAleatorio);
		
		JButton btnAleatorio = new JButton("Generar");
		btnAleatorio.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int min = (int)spMin.getValue();	
				int max = (int)spMax.getValue();
				
				int aleatorio = (int)Math.floor(Math.random()*(max-min+1));
				txtAleatorio.setText(String.valueOf(aleatorio));
			}
		});
		btnAleatorio.setBounds(174, 169, 85, 21);
		contentPane.add(btnAleatorio);
	}
}
