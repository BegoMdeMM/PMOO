package org.pmoo.packlaboratorio5;


import java.util.ArrayList;
import java.util.Iterator;

public class ListaUsuarios
{
	private ArrayList<Usuario> lista;
	private static ListaUsuarios miListaUsuarios = new ListaUsuarios();
   
    private ListaUsuarios()
    { 
		this.lista= new ArrayList<Usuario>();
    }
   	
   	public static ListaUsuarios getListaUsuarios()
   	{
   		return miListaUsuarios;
   	}

   	private ArrayList<Usuario> getLista()
   	{
   		return this.lista;
   	}
  
   	public int getTamano()
   	{
   		return this.getLista().size();
   	}
   	
   	private Iterator<Usuario> getIterador()
   	{
		return this.getLista().iterator();
   	}
      
   	public Usuario buscarUsuarioPorId(int pIdUsuario)
   	{	
   		Usuario unUsuario=null;
   		boolean esta=false;
   		Iterator<Usuario> itr=this.getIterador();
        while(itr.hasNext()&& !esta)
        {
        	unUsuario=itr.next();
        	if (unUsuario.getIdUsuario()==pIdUsuario)
        		{
        		esta=true;
        		}
        }
   		
        if (esta)
        {
        	return unUsuario;
        }
        else
        {
        	return null;
       	}
   	}
 
   	public void anadirUsuario(Usuario pUsuario)
   	{
   		if (this.buscarUsuarioPorId(pUsuario.getIdUsuario())==null)
   		{
   			this.getLista().add(pUsuario);
  		}
	}  
   
   	public void eliminarUsuario(Usuario pUsuario)
   	{
   		this.getLista().remove(pUsuario);
   	}

   	public Usuario quienLoTienePrestado(Libro pLibro)
   	{
   		Usuario unUsuario=null;
   		boolean esta=false;
   		Iterator<Usuario> it=this.getIterador();
        while(it.hasNext()&& !esta)
        {
        	unUsuario=it.next();
        	if (unUsuario.loTieneEnPrestamo(pLibro))
        		{
        		esta=true;
        		}
        }
   		
        if (esta)
        {
        	return unUsuario;
        }
        else
        {
        	return null;
       	}
   	}

   	public void imprimir()
   	{	
   		System.out.println("hay un total de " + (this.getLista().size())+ " usuarios.");
   		Usuario unUsuario;
   		Iterator<Usuario> it=this.getIterador();
   		
   		while (it.hasNext())
   		{
   			unUsuario=it.next();
   			unUsuario.imprimir();
   		}
   	}
   
   	private void setLista (ArrayList<Usuario> pLista)
   	{
   		this.lista=pLista;
   	}
   	
   	
   	public void resetear() 
   	{
   		this.setLista(new ArrayList<Usuario>());
   	}
   		
}
