package org.pmoo.packlaboratorio5;


public class Libro
{

	private int idLibro;
	private String titulo;
	private String autor;

	
	public Libro(String pTitulo, String pAutor, int pIdLibro)
	{
		idLibro = pIdLibro;
		titulo = pTitulo;
		autor = pAutor;
	} 

	public String getTitulo()
	{
		return titulo;
	}

	public int getIdLibro()
	{
		return idLibro;
	}
	
	public String getAutor()
	{
		return autor;
	}
	
	public void imprimir()
	{
		System.out.println("* " + this.getTitulo() + ", escrito por " + this.getAutor() + ".");
	}
}
