package org.pmoo.packlaboratorio3;

public class Operacion 
{
 public enum Operador {SUMA, RESTA,COCIENTE,PRODUCTO,RESTO};	
 private int operando1;
 private int operando2;
 private Operador operador;


	public Operacion (int pOperando1, int pOperando2, Operador pOperador)
	{
	this.operando1 = pOperando1;
	this.operando2 = pOperando2;
	this.operador = pOperador;
	}

	public int getOperando1() 
	{
	return this.operando1;
	}

	public void setOperando1(int pOperando1) 
	{
	this.operando1 = pOperando1;
	}

	public int getOperando2() 
	{
	return this.operando2;
	}

	public void setOperando2(int pOperando2) 
	{
	this.operando2 = pOperando2;
	}

	public Operador getOperador() 
		{
	return this.operador;
	}

	public void setOperador(Operador pOperador) 
	{
	this.operador = pOperador;
	}
	
	//Métodos
	
	public int obtenerResultado()
	{
		int op3=0;
		
		
	if (this.getOperador()==Operador.SUMA)
		{
		op3= operando1 + operando2;
		}

	if (this.getOperador()==Operador.RESTA)
		{
		op3= operando1 - operando2;
		} 
				
	if (this.getOperador()==Operador.PRODUCTO)
		{
		op3= operando1 * operando2;
		}
		 
	if (this.getOperador()==Operador.COCIENTE)
		{
	op3= operando1 / operando2;
		}

	if (this.getOperador()==Operador.RESTO)
		{
		op3=operando1 % operando2;
		}
	return op3;
	}

}
