package prog3.pr02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CocheTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	public void testfuerzaAceleracionAdelante()
	{
		double[] tablaVel = { -500, -425, -300, -250, -200, -100, 0, 125, 250, 500,
				1100 };
				double[] tablaFuerza = { 0, 0.5, 1, 1, 1, 0.65, 0.3, 0.575, 0.85, 0.85,
				0.85 };
				for (int i=0;i<tablaVel.length;i++) {
				c.setVelocidad( tablaVel[i] );
				assertEquals( "Velocidad " + tablaVel[i], tablaFuerza[i]*Coche.fuerzabaseadelante,
				c.fuerzaAceleracionAdelante(), 0.0000001 );
				}
	}
	public void testfuerzaAceleracionAtras()
	{
		double[] tablaVel = { -500, -425, -300, -250, -200, -100, 0, 125, 250, 500,
				1100 };
				double[] tablaFuerza = { 0, 0.5, 1, 1, 1, 0.65, 0.3, 0.575, 0.85, 0.85,
				0.85 };
				for (int i=0;i<tablaVel.length;i++) {
				c.setVelocidad( tablaVel[i] );
				assertEquals( "Velocidad " + tablaVel[i], tablaFuerza[i]*Coche.fuerzabaseatras,
				c.fuerzaAceleracionAtras(), 0.0000001 );
				}
	}

}
