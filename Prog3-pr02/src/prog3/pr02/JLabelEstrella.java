package prog3.pr02;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class JLabelEstrella extends JLabel{
	private static final long serialVersionUID = 1L;  // Para serialización
	public static final int tamaño = 40;  // píxels (igual ancho que algo)
	public static final int radio = 17;  // Radio en píxels del bounding circle de la estrella (para choques)
	private static final boolean aparecer = true;  // Dibujado (para depuración) del bounding circle de choque de la estrella
	
	
		
	/** Construye y devuelve el JLabel de la estrella con su gráfico y tamaño
	 */
	public JLabelEstrella() {
		// Esto se haría para acceder por sistema de ficheros
		// 		super( new ImageIcon( "bin/ud/prog3/pr00/estrella.png" ) );
		// Esto se hace para acceder tanto por recurso (jar) como por fichero
		try {
			setIcon( new ImageIcon( JLabelCoche.class.getResource( "img/estrella.png" ).toURI().toURL() ) );
		} catch (Exception e) {
			System.err.println( "No se ha encontrado la imagen" );
			e.printStackTrace();
		}
		setBounds( 0, 0, tamaño, tamaño );
		// Esto sería útil cuando hay algún problema con el gráfico: borde de color del JLabel
		// setBorder( BorderFactory.createLineBorder( Color.yellow, 4 ));
	}
}
