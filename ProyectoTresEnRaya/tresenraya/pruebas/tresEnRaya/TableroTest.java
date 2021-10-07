package tresEnRaya;
import tresEnRaya.Tablero;
import junit.framework.TestCase;
  
public class TableroTest extends TestCase{
	  protected void setUp(){
		}
	
	protected void tearDown(){//este borra las pruebas
	
	}
	
	public void testTablero(){
	//Se queda vacio	
		
	}
	
	
	public void testGetTablero() {
		assertNotNull(Tablero.getTablero());
	}

		
	public void testBuscarCasilla() {
		//tratamos directamente sobre la matriz posicion del cero a dos
		Casilla c1;
		c1=Tablero.getTablero().buscarCasilla(0, 0);
		assertEquals(c1.getValor(),' ');
		c1=Tablero.getTablero().buscarCasilla(0, 1);
		assertEquals(c1.getValor(),' ');
		c1=Tablero.getTablero().buscarCasilla(0, 2);
		assertEquals(c1.getValor(),' ');
		c1=Tablero.getTablero().buscarCasilla(1, 0);
		assertEquals(c1.getValor(),' ');
		c1=Tablero.getTablero().buscarCasilla(1, 1);
		assertEquals(c1.getValor(),' ');
		c1=Tablero.getTablero().buscarCasilla(1, 2);
		assertEquals(c1.getValor(),' ');
		c1=Tablero.getTablero().buscarCasilla(2, 0);
		assertEquals(c1.getValor(),' ');
		c1=Tablero.getTablero().buscarCasilla(2, 1);
		assertEquals(c1.getValor(),' ');
		c1=Tablero.getTablero().buscarCasilla(2, 2);
		assertEquals(c1.getValor(),' ');
		
		//Asi hasta las 9 posiciones
	}


	public void testMarcarCasilla() {
		
		Tablero.getTablero().marcarCasilla(0,1,1);
		assertEquals(Tablero.getTablero().buscarCasilla(1,1).getValor(),'X');
		Tablero.getTablero().marcarCasilla(1,1,2);
		assertEquals(Tablero.getTablero().buscarCasilla(1,2).getValor(),'O');
		
	}


	public void testLimpiarTablero() {
		
		for (int f= 0;f<3;f++){//i++ ; le aumenta en 1 a la variable i para la siguiente repeticion
			for (int c=0;c<3; c++){
			Tablero.getTablero().limpiarTablero();
			}}
		for (int f= 0;f<3;f++){//i++ ; le aumenta en 1 a la variable i para la siguiente repeticion
			for (int c=0;c<3; c++){
		assertEquals(Tablero.getTablero().buscarCasilla(f, c).getValor(),' ');
		assertNotSame(Tablero.getTablero().buscarCasilla(f, c).getValor(),'X');
		assertNotSame(Tablero.getTablero().buscarCasilla(f, c).getValor(),'O');
		assertEquals(Tablero.getTablero().buscarCasilla(f, c).isOcupado(),false);
		assertNotSame(Tablero.getTablero().buscarCasilla(f, c).isOcupado(),true);						  }
								}
		}

	
	public void testImprimirTablero() {
		//Solo saca por pantalla, buscar
		}


	public void testBuscar_tres_en_raya() {
		//horizontal
		Tablero.getTablero().marcarCasilla(1,0,0);
		Tablero.getTablero().marcarCasilla(1,1,1);
		Tablero.getTablero().marcarCasilla(0,2,2);
		
		assertSame(Tablero.getTablero().buscar_tres_en_raya(0, 0),(false));
		assertSame(Tablero.getTablero().buscar_tres_en_raya(1, 1),(false));
		assertSame(Tablero.getTablero().buscar_tres_en_raya(2, 2),(false));
		
		Tablero.getTablero().marcarCasilla(0,2,1);
		Tablero.getTablero().marcarCasilla(0,2,0);
		assertSame(Tablero.getTablero().buscar_tres_en_raya(2, 2),(true));
		//vertical
		Tablero.getTablero().marcarCasilla(0,0,0);
		Tablero.getTablero().marcarCasilla(1,1,1);
		Tablero.getTablero().marcarCasilla(1,2,2);
		
		assertSame(Tablero.getTablero().buscar_tres_en_raya(0, 0),(false));
		assertSame(Tablero.getTablero().buscar_tres_en_raya(1, 1),(false));
		assertSame(Tablero.getTablero().buscar_tres_en_raya(2, 2),(false));
		
		Tablero.getTablero().marcarCasilla(0,0,1);
		Tablero.getTablero().marcarCasilla(0,0,2);
		assertSame(Tablero.getTablero().buscar_tres_en_raya(0, 0),(true));
		//diagonalDcha
		
		Tablero.getTablero().marcarCasilla(1, 0, 0);
		assertEquals(Tablero.getTablero().buscarCasilla(0, 0).getValor(),'O');
		assertEquals(Tablero.getTablero().buscar_tres_en_raya(0, 0),(true));
		//diagonalIzda
			
		Tablero.getTablero().marcarCasilla(0, 0, 0);
		Tablero.getTablero().marcarCasilla(0, 0, 1);
		Tablero.getTablero().marcarCasilla(1, 0, 2);
		
		assertEquals(Tablero.getTablero().buscar_tres_en_raya(0, 0),(false));
		
		Tablero.getTablero().marcarCasilla(1, 0, 2);
		Tablero.getTablero().marcarCasilla(1, 2, 0);
		Tablero.getTablero().marcarCasilla(1, 1, 1);
				
		assertEquals(Tablero.getTablero().buscar_tres_en_raya(0, 2),(true));
	}	

}
