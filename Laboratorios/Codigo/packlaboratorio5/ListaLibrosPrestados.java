package org.pmoo.packlaboratorio5;


import java.util.ArrayList;
import java.util.Iterator;

public class ListaLibrosPrestados
{
   private ArrayList<Libro> lista;

   public ListaLibrosPrestados()
   {
	   lista = new ArrayList<Libro>();
   }
   
   private ArrayList<Libro> getLista()
   {
	   return this.lista;
   }
   
   public int getTamano()
   {
	   return this.getLista().size();
   }
   
   private Iterator<Libro> getIterador()
   {
	   return  this.getLista().iterator();
   }

   public void anadirLibro(Libro pLibro)
   {
	   this.getLista().add(pLibro);
   }
   
   public void eliminarLibro(Libro pLibro)
   {
	   this.getLista().remove(pLibro);	
   }
	
   public void imprimir()
   {
	   Libro unLibro;
	   Iterator<Libro> it = this.getIterador();
	   
	   while (it.hasNext())
	   {
		   unLibro = it.next();
		   unLibro.imprimir();
	   }
   }

   public boolean esta(Libro pLibro)
   {
	   return  this.getLista().contains(pLibro);
   }

}
