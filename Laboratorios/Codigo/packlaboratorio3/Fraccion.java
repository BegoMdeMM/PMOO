package org.pmoo.packlaboratorio3;

public class Fraccion implements IFraccion
{

	private int numerador;
	private int denominador;
	
	
	public Fraccion (int pNumerador, int pDenominador)
		{
		this.numerador = pNumerador;
		this.denominador = pDenominador;
		}
	
	
	public int getNumerador() 
		{
		return this.numerador;
		}

	public void setNumerador(int pNumerador) 
		{
		this.numerador=pNumerador;
		}

	public int getDenominador() 
		{
		return this.denominador;
		}

	public void setDenominador(int pDenominador) 
		{
		this.denominador=pDenominador;
		}

	
	public Fraccion simplificar() 
		{
		int menor=0;
		
		if (this.getDenominador()<0)
			{
			this.denominador=(denominador*(-1));
			this.numerador=(numerador*(-1));
			}
		
		if (this.getDenominador()==0)
			{
			System.out.println("Has intentado dividir por 0");
			}
			

		if (this.getNumerador()==this.getDenominador())
			{
			this.numerador=1;
			this.denominador=1;
			menor=1;
			}
				else if (this.getNumerador()<this.getDenominador())
					{
					menor=getNumerador();
					if (menor<0);
					{
					menor=Math.abs(menor);
					}
			}
		else
			{
			menor=getDenominador();
			if (menor<0);
				{
				menor=Math.abs(menor);
				}
			}
		
		while ((this.getNumerador() % (menor) != 0) || (this.getDenominador()) % (menor) != 0)
			{
			menor=menor-1;
			}
			if ((this.getNumerador()%(menor)==0) && this.getDenominador()%(menor)==0)
				{
				if (menor<0);
				{
				menor=Math.abs(menor);
				}
				this.numerador=(numerador/menor);
				this.denominador=(denominador/menor);
				}
			Fraccion resultado = new Fraccion(this.numerador,this.denominador);
		return resultado;
		}

	
	public Fraccion sumar(Fraccion pFraccion)
	{
		Fraccion pFraccion3;
		pFraccion3 = new Fraccion (0,0);

		if (pFraccion.getDenominador()!=this.getDenominador())
			{
			pFraccion3.numerador=(pFraccion.getNumerador()*this.getDenominador()) + (this.getNumerador()*pFraccion.getDenominador());
			pFraccion3.denominador=pFraccion.getDenominador()*this.getDenominador();
			}
		
		pFraccion3= pFraccion3.simplificar();

		return pFraccion3;
	}


	public Fraccion restar(Fraccion pFraccion)
	{
		Fraccion pFraccion3;
		pFraccion3 = new Fraccion (0,0);
		if (this.getDenominador()!=pFraccion.getDenominador())
			{
			pFraccion3.numerador=(this.getNumerador()*pFraccion.getDenominador()) - (pFraccion.getNumerador()*this.getDenominador());
			pFraccion3.denominador=this.getDenominador()*pFraccion.getDenominador();
			}
		
		if (pFraccion3.denominador<0)
			{
			pFraccion3.denominador=-pFraccion3.denominador;
			pFraccion3.numerador=-pFraccion3.numerador;
			}
		pFraccion3= pFraccion3.simplificar();
		return pFraccion3;
	}



	public Fraccion multiplicar(Fraccion pFraccion)
	{
		Fraccion pFraccion3;
		pFraccion3 = new Fraccion (0,0);
		pFraccion3.numerador=this.getNumerador()*pFraccion.getNumerador();
		pFraccion3.denominador=this.getDenominador()*pFraccion.getDenominador();

		if (pFraccion3.denominador<0)
			{
			pFraccion3.denominador=-pFraccion3.denominador;
			pFraccion3.numerador=-pFraccion3.numerador;
			}
		pFraccion3= pFraccion3.simplificar();
		return pFraccion3;
	}
		

	public Fraccion dividir(Fraccion pFraccion)
	{
		Fraccion pFraccion3;
		pFraccion3 = new Fraccion (0,0);
		pFraccion3.numerador=this.getNumerador()*pFraccion.getDenominador();
		pFraccion3.denominador=this.getDenominador()*pFraccion.getNumerador();
	
		if (pFraccion3.denominador<0)
			{
			pFraccion3.denominador=-pFraccion3.denominador;
			pFraccion3.numerador=-pFraccion3.numerador;
			}
		pFraccion3= pFraccion3.simplificar();
		return pFraccion3;
	}


	public boolean esIgualQue(Fraccion pFraccion)
	{
		boolean condicion=false;
		if (this.getNumerador()==pFraccion.getNumerador() && this.getDenominador()==pFraccion.getDenominador())
			{
			condicion = true;
			}
		return condicion;
	}

	public boolean esMayorQue(Fraccion pFraccion) 
	{
		double a;
		double b;
		boolean condicion=false;
		a= this.getNumerador()/this.getDenominador();
		b= pFraccion.getNumerador()/pFraccion.getDenominador();

		if (a>b)
			{
			condicion=true;
			}
		return condicion;
	}


	public boolean esMenorQue(Fraccion pFraccion) 
	{
		double a;
		double b;
		boolean condicion=false;
		a= this.getNumerador()/this.getDenominador();
		b= pFraccion.getNumerador()/pFraccion.getDenominador();

		if (a<b)
			{
			condicion=true;
			}
		return condicion;
	}


	public boolean esMayorOIgualQue(Fraccion pFraccion) 
	{
		double a;
		double b;
		boolean condicion=false;
		a= this.getNumerador()/this.getDenominador();
		b= pFraccion.getNumerador()/pFraccion.getDenominador();

		if (a>=b)
			{
			condicion=true;
			}
		return condicion;
	}

	public boolean esMenorOIgualQue(Fraccion pFraccion) 
	{
		double a;
		double b;
		boolean condicion=false;
		a= this.getNumerador()/this.getDenominador();
		b= pFraccion.getNumerador()/pFraccion.getDenominador();
	
		if (a<=b)
			{
			condicion=true;
			}
		return condicion;
	}
}