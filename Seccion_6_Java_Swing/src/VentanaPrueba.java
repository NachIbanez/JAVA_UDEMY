import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPrueba extends JFrame {

	private JPanel contentPane;
	private JTextField txtSaludar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrueba frame = new VentanaPrueba();
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
	public VentanaPrueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("PRIMERA APLICACION SWING");
		lblTitulo.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblTitulo.setBounds(190, 10, 304, 19);
		contentPane.add(lblTitulo);
		
		JButton btnSaludar = new JButton("Saludar");
		btnSaludar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtSaludar.setText("HOLA MUNDO SWING");
			}
		});
		btnSaludar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 13));
		btnSaludar.setBounds(276, 88, 107, 27);
		contentPane.add(btnSaludar);
		
		txtSaludar = new JTextField();
		txtSaludar.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		txtSaludar.setBounds(228, 185, 218, 27);
		contentPane.add(txtSaludar);
		txtSaludar.setColumns(10);
	}
}
