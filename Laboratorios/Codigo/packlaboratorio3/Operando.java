package org.pmoo.packlaboratorio3;

public class Operando 
{
int valor;

	//Consructora
	public Operando (int pValor)
	{
		this.valor=pValor;
	}

	public int getValor() 
	{
		return this.valor;
	}

	public void setValor(int pValor) 
	{
		this.valor = pValor;
	}
	
	public Operando sumar(Operando pOperando)
	{
		return new Operando(pOperando.getValor() + this.getValor());
	}
	
	public Operando restar(Operando pOperando)
	{
		return new Operando(this.getValor() - pOperando.getValor());
	}
	
	public Operando multiplicar(Operando pOperando)
	{
		return new Operando(pOperando.getValor()* this.getValor());
	}
	
	public Operando dividir(Operando pOperando)
	{
		return new Operando(this.getValor() / pOperando.getValor());
	}
	
	public Operando getResto(Operando pOperando)
	{
		return new Operando(this.getValor() %  pOperando.getValor());
	}
	
	
}
