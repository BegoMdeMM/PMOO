package tresEnRaya;
public class Movimiento {

//patron singlenton
//Generamos una instancia de forma estática

	private int f;
	private int c;
	private static Movimiento miMovimiento = new Movimiento();

	//constructora
	private Movimiento(){
	//no ha nada solo se reconoce asi misma
	
	}
	//Constructora;
	public static Movimiento getMiMovimiento() {
		return miMovimiento;
	}
	public static void setMiMovimiento(Movimiento miMovimiento) {
		//carace de ella
		Movimiento.miMovimiento = miMovimiento;
	}
	public int getF() {
		return f;
	}
	public void modificarFila(int f) {
		this.f = f;
	}
	public int getC() {
		return c;
	}
	public void modificarColumna(int c) {
		this.c = c;
	}
}
