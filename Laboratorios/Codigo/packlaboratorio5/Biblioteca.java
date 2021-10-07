package org.pmoo.packlaboratorio5;


public class Biblioteca
{
	private static Biblioteca miBiblioteca = new Biblioteca();
	
	private Biblioteca()
	{
		//no hace nada, pero se define privada
	}
	
	public static Biblioteca getBiblioteca()
	{
		return miBiblioteca;
	}
	
	public void prestarLibro(int pIdLibro, int pIdUsuario)
	{
		ListaUsuarios.getListaUsuarios().buscarUsuarioPorId(pIdUsuario);
		Catalogo.getCatalogo().buscarLibroPorId(pIdLibro);
		//SIN TERMINAR
		
		
		this.prestarLibro(pIdLibro, pIdUsuario);
	}

	public void devolverLibro(int pIdLibro)
	{
		//TODO completar
	}

	public void imprimirEstado()
	{
		ListaUsuarios.getListaUsuarios().imprimir();
		Catalogo.getCatalogo().imprimir();
	}

	public void darDeAltaUsuario(String pNombre, int pIdUsuario)
	{
		Usuario unUsuario=new Usuario(pNombre, pIdUsuario);
		ListaUsuarios.getListaUsuarios().anadirUsuario(unUsuario);
	}
 
	public void darDeBajaUsuario(int pIdUsuario)
	{
		Usuario unUsuario=ListaUsuarios.getListaUsuarios().buscarUsuarioPorId(pIdUsuario);
		if (unUsuario!=null)
		{
			ListaUsuarios.getListaUsuarios().eliminarUsuario(unUsuario);
		}
		else
		{
		System.out.println("el usuario no ha sido encontrado");
		}
	}
 
	public void catalogarLibro(String pTitulo, String pAutor, int pIdLibro)
	{
		Libro pLibro=new Libro(pTitulo, pAutor, pIdLibro);
		Catalogo.getCatalogo().anadirLibro(pLibro);
	}
	
 
	public void descatalogarLibro(int pIdLibro)
	{
		Libro pLibro=Catalogo.getCatalogo().buscarLibroPorId(pIdLibro);
		if (pLibro!=null)
		{
			Catalogo.getCatalogo().eliminarLibro(pLibro);
		}
		else
		{
		System.out.println("el libro no ha sido encontrado");
		}
	}
 
	public void resetear()
	{
		ListaUsuarios.getListaUsuarios().resetear();
		Catalogo.getCatalogo().resetear();
	}
  
}