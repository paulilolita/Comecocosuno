package prog3.pr02;

/** Clase para definir instancias lógicas de coches con posición, dirección y velocidad.
 * @author Andoni Eguíluz
 * Facultad de Ingeniería - Universidad de Deusto (2014)
 */
public class Coche {
	protected double miVelocidad;  // Velocidad en pixels/segundo
	protected double miDireccionActual;  // Dirección en la que estoy mirando en grados (de 0 a 360)
	protected double posX;  // Posición en X (horizontal)
	protected double posY;  // Posición en Y (vertical)
	protected String piloto;  // Nombre de piloto
	
	// Constructores
	static  double masa=1;
	static   double fuerzabaseadelante=2000;
	static   double fuerzabaseatras=1000;
	static   double coefaire =0.35;
    static   double coefsuelo= 15.5;
    
	public Coche() {
		miVelocidad = 0;
		miDireccionActual = 0;
		posX = 300;
		posY = 300;
	}
	
	/** Devuelve la velocidad actual del coche en píxeles por segundo
	 * @return	velocidad
	 */
	public double getVelocidad() {
		return miVelocidad;
	}

	/** Cambia la velocidad actual del coche
	 * @param miVelocidad
	 */
	
	public void setVelocidad( double miVelocidad ) {
		this.miVelocidad = miVelocidad;
	}

	public double getMiVelocidad() {
		return miVelocidad;
	}

	public void setMiVelocidad(double miVelocidad) {
		this.miVelocidad = miVelocidad;
	}

	public double getMiDireccionActual() {
		return miDireccionActual;
	}

	public void setMiDireccionActual(double miDireccionActual) {
		this.miDireccionActual = miDireccionActual;
	}

	public static double getMasa() {
		return masa;
	}

	public static double getFuerzabaseadelante() {
		return fuerzabaseadelante;
	}

	public static double getFuerzabaseatras() {
		return fuerzabaseatras;
	}

	public static double getCoefaire() {
		return coefaire;
	}

	public static double getCoefsuelo() {
		return coefsuelo;
	}

	public double getDireccionActual() {
		return miDireccionActual;
	}

	public void setDireccionActual( double dir ) {
		// if (dir < 0) dir = 360 + dir;
		if (dir > 360) dir = dir - 360;
		miDireccionActual = dir;
	}

	public double getPosX() {
		return posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosicion( double posX, double posY ) {
		setPosX( posX );
		setPosY( posY );
	}
	
	public void setPosX( double posX ) {
		this.posX = posX; 
	}
	
	public void setPosY( double posY ) {
		this.posY = posY; 
	}
	
	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}


	/** Cambia la velocidad actual del coche
	 * @param aceleracion	Incremento/decremento de la velocidad en pixels/segundo
	 * @param tiempo	Tiempo transcurrido en segundos
	 */
	public void acelera( double aceleracion, double tiempo ) {
		miVelocidad = MundoJuego.calcVelocidadConAceleracion( miVelocidad, aceleracion, tiempo );
	}
	
	/** Cambia la dirección actual del coche
	 * @param giro	Angulo de giro a sumar o restar de la dirección actual, en grados (-180 a +180)
	 * 				Considerando positivo giro antihorario, negativo giro horario
	 */
	public void gira( double giro ) {
		setDireccionActual( miDireccionActual + giro );
	}
	
	/** Cambia la posición del coche dependiendo de su velocidad y dirección
	 * @param tiempoDeMovimiento	Tiempo transcurrido, en segundos
	 */
	public void mueve( double tiempoDeMovimiento ) {
		setPosX( posX + MundoJuego.calcMovtoX( miVelocidad, miDireccionActual, tiempoDeMovimiento ) );
		setPosY( posY + MundoJuego.calcMovtoY( miVelocidad, miDireccionActual, tiempoDeMovimiento ) );
	}
	
	@Override
	public String toString() {
		return piloto + " (" + posX + "," + posY + ") - " +
			   "Velocidad: " + miVelocidad + " ## Dirección: " + miDireccionActual; 
	}
	
	public double fuerzaAceleracionAdelante() {
		if (miVelocidad<=-150) return fuerzabaseadelante;
		else if (miVelocidad<=0)
		return fuerzabaseadelante*(-miVelocidad/150*0.5+0.5);
		else if (miVelocidad<=250)
		return fuerzabaseadelante*(miVelocidad/250*0.5+0.5);
		else if (miVelocidad<=750)
		return fuerzabaseadelante;
		else return fuerzabaseadelante*(-(miVelocidad-1000)/250);
		}
	


	public double fuerzaAceleracionAtras() {
		if (miVelocidad<=-150) return fuerzabaseatras;
		else if (miVelocidad<=0)
		return fuerzabaseatras*(-miVelocidad/150*0.2+0.3);
		else if (miVelocidad<=250)
		return fuerzabaseatras*(miVelocidad/250*0.55+0.3);
		else if (miVelocidad<=750)
		return fuerzabaseatras;
		else return fuerzabaseatras;
	}
}

