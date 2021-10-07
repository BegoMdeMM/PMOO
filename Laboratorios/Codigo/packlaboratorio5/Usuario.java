package org.pmoo.packlaboratorio5;


public class Usuario
{

	//atributos

	private int idUsuario;
	private String nombreCompleto;
	private int maxLibros;
	private ListaLibrosPrestados librosPrestados;
	
	//constructora
	
	public Usuario(String pNombre, int pIdUsuario)
	{
		idUsuario=pIdUsuario;
		nombreCompleto=pNombre;
		this.librosPrestados=new ListaLibrosPrestados();
		maxLibros=3;
	}
	
	//getters y setters
	
	public int getMaxLibros()
	{
		return this.maxLibros;
	}
	
	public String getNombreCompleto()
	{
		return this.nombreCompleto;
	}
	
	public int getIdUsuario()
	{
		return this.idUsuario;		
	}
	
	private ListaLibrosPrestados getListaLibrosPrestados()
	{
		return this.librosPrestados;
	}
	
	public int cuantosLibrosTiene()
	{
		return this.getListaLibrosPrestados().getTamano();
	}
	
	public void anadirLibro(Libro pLibro)
	{
		this.getListaLibrosPrestados().anadirLibro(pLibro);
	}

	public void quitarLibro(Libro pLibro)
	{
		this.getListaLibrosPrestados().eliminarLibro(pLibro);
	}
	
	public boolean loTieneEnPrestamo(Libro pLibro)
	{
		return this.getListaLibrosPrestados().esta(pLibro);
	}
	
	public void imprimir()
	{
		System.out.println(this.getIdUsuario());
		System.out.println(this.getNombreCompleto());
			
		if(this.getListaLibrosPrestados().getTamano()>0)
		{
			this.getListaLibrosPrestados().imprimir();
		}
	}
}