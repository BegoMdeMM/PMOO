package org.pmoo.packlaboratorio4;

public class Cliente 
{
	private int idCliente;
	private String nombre;
	private String clave;
	private double saldo;
	private boolean esPreferente;
	
	public Cliente (int pId, String pNombre, String pClave, double pSaldo, boolean pPref)
	{
		this.idCliente=pId;
		this.nombre=pNombre;
		this.clave=pClave;
		this.saldo=pSaldo;
		this.esPreferente=pPref;
	}
	
	public int getIdentificador ()
	{
		return this.idCliente;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	private String getClave()
	{
		return this.clave;
	}
	
	public boolean comprobarClave(String pClave)
	{
		if (this.getClave()==pClave)
			{return true;}
		else 
		    {return false;}
	}
	
	public double getSaldo()
	{
		return this.saldo;
	}
	
	private void setSaldo(double pSaldo)
	{
		this.saldo=pSaldo;
	}
	public boolean getEsPreferente()
	{
		return this.esPreferente;
	}
	
	public void actualizarSaldo(double pSaldo)
	{
		if (pSaldo < this.getSaldo() && pSaldo > 0)
		{
			setSaldo(this.getSaldo()-pSaldo);
			System.out.print("Saldo actualizado correctamente, su nuevo saldo es "+this.getSaldo());
		}
		else
		{
			System.out.print("Error en la operacion, saldo no actualizado");
		}
	}
}