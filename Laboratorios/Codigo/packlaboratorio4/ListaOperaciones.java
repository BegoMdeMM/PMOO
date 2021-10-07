package org.pmoo.packlaboratorio4;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaOperaciones 
{ 
private ArrayList<Operacion> lista;
private static ListaOperaciones miListaOperaciones = new ListaOperaciones();
	
	private ListaOperaciones()
	{
		this.lista= new ArrayList<Operacion>();
	}
	
	public static ListaOperaciones getListaOperaciones()
	{
		return miListaOperaciones;
	}
	
	private ArrayList<Operacion> getLista()
	{
		return this.lista;
	}


	private Iterator<Operacion> getIterator()
	{
		return this.getLista().iterator();
	}
	
	private Operacion buscarOperacionPorId(int pId)
	
	{
		 Operacion unaOperacion;
		 Iterator<Operacion> itr = this.getIterator();
		 while (itr.hasNext())
			 {
				unaOperacion=itr.next(); 
				if(unaOperacion.getIdOperacion() == pId)
				{return unaOperacion;}
			 }
		 return null;
	}
	
	public void anadirOperacion (Operacion pOperacion)
	{if (this.buscarOperacionPorId(pOperacion.getIdOperacion())==null)
		{
		 this.getLista().add(pOperacion);
		}
	}
	
	public void realizarOperaciones()
	{	
		Operacion unaOperacion;
		Iterator<Operacion> itr = this.getIterator();
		while(itr.hasNext())
		{
			unaOperacion=itr.next();
			unaOperacion.realizarOperacion();
		}
	}
	
	public void resetear()
	{
		this.getLista().clear();
		
	}
}