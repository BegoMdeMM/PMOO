package org.pmoo.packlaboratorio1;

public class Coche 
{
	private String matricula;
	private String marcaModelo;
	private Persona propietario;
	
	public Coche ()
	{
		this.matricula = "placa";
		this.marcaModelo = "fabricante";
		this.propietario = this.getPropietario();	
	}
	
	
	public String getMatricula() 
	{
		return this.matricula;
	}
	
	public void setMatricula(String pMatricula) 
	{
		this.matricula = pMatricula;
	}
	
	public String getMarcaModelo() 
	{
		return this.marcaModelo;
	}
	
	public void setMarcaModelo(String pMarcaModelo) 
	{
		this.marcaModelo = pMarcaModelo;
	}
	
	public Persona getPropietario() 
	{
		return this.propietario;
	}
	
	public void setPropietario(Persona pPropietario) 
	{
		this.propietario = pPropietario;
	}

	
}
