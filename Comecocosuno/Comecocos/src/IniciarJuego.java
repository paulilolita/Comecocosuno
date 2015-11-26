import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class IniciarJuego extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnEmpezarAJugar;
	
	public final static String EMPEZAR_JUEGO = "EMPEZAR_JUEGO";

	
	public IniciarJuego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(53, 76, 46, 14);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(187, 73, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnEmpezarAJugar = new JButton("Empezar a jugar ");
		btnEmpezarAJugar.addActionListener(this);
		btnEmpezarAJugar.setBounds(113, 132, 215, 53);
		btnEmpezarAJugar.setActionCommand(EMPEZAR_JUEGO);
		contentPane.add(btnEmpezarAJugar);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (e.getActionCommand())
		{
		case EMPEZAR_JUEGO : GeneradorEntorno entorno = new GeneradorEntorno ();
		entorno.setVisible(true); break;
		}
		
	}
}
