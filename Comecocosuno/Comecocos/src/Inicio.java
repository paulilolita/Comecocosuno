import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Inicio extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnIniciarJuego;
	private JButton btnCrearUsuario;
	
	public final static String INICIAR_JUEGO = "INICIAR_JUEGO";
	public final static String NUEVO_USUARIO = "NUEVO_USUARIO";
	
	


	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnIniciarJuego = new JButton("Iniciar Juego");
		btnIniciarJuego.addActionListener(this);
		btnIniciarJuego.setBounds(50, 70, 148, 52);
		btnIniciarJuego.setActionCommand(INICIAR_JUEGO);
		contentPane.add(btnIniciarJuego);
		
		
		btnCrearUsuario = new JButton("Crear usuario");
		btnCrearUsuario.addActionListener(this);
		btnCrearUsuario.setBounds(242, 70, 148, 52);
		btnIniciarJuego.setActionCommand(NUEVO_USUARIO);
		contentPane.add(btnCrearUsuario);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (e.getActionCommand())
		{
		case INICIAR_JUEGO: IniciarJuego iniciar = new IniciarJuego(); 
		iniciar.setVisible (true); break;
		case NUEVO_USUARIO:NuevoUsuario nuevo = new NuevoUsuario (); 
		nuevo.setVisible (true); break;
		}
	}
}
