package tresEnRaya;
import  tresEnRaya.Movimiento;
import junit.framework.TestCase;
public class MovimientoTest extends TestCase{
	
protected void setup(){
	
	
}
protected void tearDown(){
	
}
	public void testGetMovimiento()
	{
		Movimiento.getMiMovimiento().modificarFila(2);
		assertTrue(2==Movimiento.getMiMovimiento().getF());
		
		Movimiento.getMiMovimiento().modificarColumna(3);
		assertTrue(3==Movimiento.getMiMovimiento().getC());
		
	}
		
	public void testModificarFila() {
		
		Movimiento.getMiMovimiento().modificarFila(1);
		assertEquals(Movimiento.getMiMovimiento().getF(),1);
		//assertNull(Movimiento.getMiMovimiento().getF(),2);
		
	}

	
	public void testModificarColumna() {
		Movimiento.getMiMovimiento().modificarColumna(1);
		assertEquals(Movimiento.getMiMovimiento().getC(),1);
	}

}
