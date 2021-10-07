package tresEnRaya;


import junit.framework.TestCase;

public class TresEnRayaTest extends TestCase {
	protected void setUp(){}
	protected void tearDown(){}
	
	int contCasillasTurno;
	//Se ha de declarar asi por que el TresEnRaya es totalmente privado
	//no permite ver lo getters y este depende de ellos.
	public int getContCasillasTurno() {
		return contCasillasTurno;
		
	}

	public void setContCasillasTurno(int contCasillasTurno) {
		assertNotNull(contCasillasTurno);
	}
	//Esta clase tienen todos los metodos privados y no se pueden comprovar en
	//las Junit. Asi que su demostrascion de que funciona es que funcional el 
	//resto. Incluido el ejecutable.
	
	public void testJugar() {
		//private comprobarQueHayMovimiento(){}
		//No se me ocurres con demostrar pacticamente este metodo privado para demostrar
		//que si funcionas
		for (int f= 0;f<3;f++){//i++ ; le aumenta en 1 a la variable i para la siguiente repeticion
			for (int c=0;c<3; c++){
			Tablero.getTablero().marcarCasilla(1, f, c);
			contCasillasTurno++;
			
		
		assertSame(Tablero.getTablero().buscarCasilla(f,c).isOcupado(),(true));
		contCasillasTurno++;
		
		
		
		
	}

}
}}