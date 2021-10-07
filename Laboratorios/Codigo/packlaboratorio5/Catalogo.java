package org.pmoo.packlaboratorio5;

import java.util.ArrayList;
import java.util.Iterator;

public class Catalogo
{
	private ArrayList<Libro> lista;
	private static Catalogo miCatalogo = new Catalogo();
	
	private Catalogo()
	{ 
		this.lista = new ArrayList<Libro>();
	}
	
 	public static Catalogo getCatalogo() 
	{
		return miCatalogo;
	}

 	private ArrayList<Libro> getLista()
 	{
 		return Catalogo.getCatalogo().lista; 
 	}

 	public int getTamano()
 	{
 	  return Catalogo.getCatalogo().getLista().size();
 	}
 	
 	private Iterator<Libro> getIterador()
 	{
 		return Catalogo.getCatalogo().getLista().iterator();
 	}

 	public Libro buscarLibroPorId(int pIdLibro)
 	{
	   Iterator<Libro> it = getIterador();
	   boolean encontrado = false;
	   Libro unLibro=null;
	   while (!encontrado && it.hasNext())
	   {
		   unLibro = it.next(); 
		   if (unLibro.getIdLibro() == pIdLibro)
		    {
		      encontrado = true;	 
	        }
	   }
	   if (encontrado)
	   {
		   return unLibro;
	   }
	   else
	   {
		   return null;
	   }
 	}

 	public void anadirLibro(Libro pLibro)
 	{
 		
 		if (Catalogo.getCatalogo().buscarLibroPorId(pLibro.getIdLibro()) == null)
		{
 			Catalogo.getCatalogo().getLista().add(pLibro);	
		}
		else
		{
			System.out.println("El libro con ID = " + pLibro.getIdLibro() + " ya existe...");
			System.out.println("... y por eso no se ha podido añadir: ");
			pLibro.imprimir();
		}
 		
 	}

 	public void eliminarLibro(Libro pLibro)
 	{
 		Catalogo.getCatalogo().getLista().remove(pLibro);
 	}

 	public void imprimir()
 	{
 		Libro unLibro;
 		Iterator<Libro> it = getIterador();
   
 		System.out.println("\nEl catálogo tiene un total de " + this.getTamano() + " títulos.");
	  
 		while (it.hasNext())
 		{
 			unLibro = it.next();
 			unLibro.imprimir();
 		}
 	}

 	public void resetear()
 	{
 		this.lista = new ArrayList<Libro>();
 	}
}	