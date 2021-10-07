package org.pmoo.packlaboratorio3;
public class NumeroComplejo implements IComplejo
{
	double parteReal;
	double parteImaginaria;
	
	public NumeroComplejo (double pParteReal, double pParteImaginaria)
			{
			this.parteReal=pParteReal;
			this.parteImaginaria=pParteImaginaria;	
			}
	
	public double getModulo()
			{
			return Math.sqrt((parteReal*parteReal + parteImaginaria*parteImaginaria)); 
			}
		
	public double getAngulo()
			{
			return Math.toDegrees(Math.atan(this.parteImaginaria/this.parteReal));
			}
	
	 public  double getParteReal()
	 		{
			 return this.parteReal;
	 		}
		 
	 public  double getParteImaginaria()
		 	{
		     return this.parteImaginaria;
		 	}
		 
	 public NumeroComplejo sumar(IComplejo pNumComp)
	 		{
			 double sumaReal = this.parteReal+pNumComp.getParteReal();
			 double sumaImaginaria = this.parteImaginaria+pNumComp.getParteImaginaria();
			 NumeroComplejo suma;
			 suma= new NumeroComplejo(sumaReal,sumaImaginaria);
			 return suma;
	 		}
	 
	 public NumeroComplejo multiplicar(IComplejo pNumComp)
		 	{	 
			 double multReal = (this.parteReal*pNumComp.getParteReal())-(this.parteImaginaria*pNumComp.getParteImaginaria());
			 double multImaginaria = (this.parteImaginaria*pNumComp.getParteReal())+(this.parteReal*pNumComp.getParteImaginaria());
			 NumeroComplejo mult;
			 mult= new NumeroComplejo (multReal,multImaginaria);
			 return mult;
		 	}
		 
	 public boolean esIgual(IComplejo pNumComp)
		   {
		    if (this.getParteReal()==pNumComp.getParteReal() && this.getParteImaginaria()==pNumComp.getParteImaginaria()) 
				{
				return true;
				}
		    else
			    {
				return false;
			    }
		    }
}