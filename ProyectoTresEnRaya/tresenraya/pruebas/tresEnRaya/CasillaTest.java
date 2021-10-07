package tresEnRaya;
import junit.framework.TestCase;
import tresEnRaya.Casilla;
public class CasillaTest extends TestCase{
	
	
	  Casilla casilla1 =null;
		
		protected void setUp(){
		
		casilla1 = new Casilla();	
	}
	protected void tearDown(){//este borra las pruebas
		casilla1=null;
	}
		
	public void testCasilla() {
		/*Movimiento.getMiMovimiento().modificarFila(2);
		assertTrue(2==Movimiento.getMiMovimiento().getF());*/;
	
		assertNotNull(casilla1);
	}

	
	public void testSetValor() {
		assertNotSame('X',casilla1.getValor());
		assertEquals(' ',casilla1.getValor());
		casilla1.setValor('X');
		assertNotSame(' ',casilla1.getValor());
		assertEquals('X',casilla1.getValor());
	}

	
	public void testGetValor() {
		//para que este funcione tengo que ponerlo en public
		//Es el mismo ya que se necesitan los mismos para realizarlos
		assertNotSame('X',casilla1.getValor());
		assertEquals(' ',casilla1.getValor());
		casilla1.setValor('X');
		assertNotSame(' ',casilla1.getValor());
		assertEquals('X',casilla1.getValor());
	}
	
	public void testMarcar() {
		//añadir 3 posis mas
		
		casilla1.marcar(0);
		assertEquals('O',casilla1.getValor());
		assertNotSame('X',casilla1.getValor());
		assertNotSame(' ',casilla1.getValor());
		casilla1.marcar(1);
		assertEquals('X',casilla1.getValor());
		assertNotSame('O',casilla1.getValor());
		assertNotSame(' ',casilla1.getValor());		
	}

	
	public void testIsOcupado() {
	//para que este funcione tengo que ponerlo en public	
	assertFalse(casilla1.isOcupado());
	casilla1.setOcupado(true);
	assertTrue(casilla1.isOcupado());
	}


	public void testVaciarCasilla() {
		casilla1.setValor('X');
		casilla1.setOcupado(true);
		assertTrue(casilla1.isOcupado());
		assertSame('X',casilla1.getValor());
		casilla1.vaciarCasilla();
		assertEquals(' ',casilla1.getValor());
		assertFalse(casilla1.isOcupado());
	}

}
