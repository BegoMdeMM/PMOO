package tresEnRaya;
public class Casilla {
	//atributos.
	
	private char valor;
	private boolean ocupado;
	
	//constructora.
	public Casilla(){
		this.valor = (' ');
		this.ocupado=false;
	}
	//getter and setters.
	//para la prueba lo pongo en public
	public void setValor(char pValor)
	{
		this.valor = pValor;
	}
	
	public char getValor() {
		return valor;
	}

	public void marcar(int turno) {
		  this.setOcupado(true);
		if (turno == 0)
			{this.setValor('X');}
		else
			{this.setValor('O');}
	}
	//Esta marcada:
	//este me dice si esta ocupado true, y si no false;
	 public boolean isOcupado() {
		return ocupado;
	}
	 //lo hago public para los casos de prueba
	public void setOcupado(boolean pOcupado) {
		this.ocupado = pOcupado;
	}
	//Quitar marca:
	public void vaciarCasilla(){
		this.setOcupado(false);
		this.setValor(' ');
	}
}