package org.pmoo.packlaboratorio4;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaClientes 
{ 
private ArrayList<Cliente> lista;
private static ListaClientes miListaClientes = new ListaClientes();
	
	private ListaClientes()
	{
		this.lista= new ArrayList<Cliente>();
	}
	
	public static ListaClientes getListaClientes()
	{
		return miListaClientes;
	}
	
	private ArrayList<Cliente> getLista()
	{
		return this.lista;
	}
	
	private void setLista(ArrayList<Cliente> pLista)
	{
		this.lista=pLista;
	}
	
	public Iterator<Cliente> getIterator()
	{
		return this.getLista().iterator();
	} 
	
	public Cliente buscarClientePorId(int pId)
	{  
		Cliente uncliente = null;
		Iterator<Cliente> itr = this.getIterator();
		
		while (itr.hasNext())
	    {
			uncliente=itr.next(); 
			if(uncliente.getIdentificador() == pId)
			{
				return uncliente;
			}
	    }
	   return uncliente;
	 }
	
	public void anadirCliente (Cliente pCliente)
	{
		this.getLista().add(pCliente);
	}
	
	public void resetear()
	{
		this.setLista(new ArrayList<Cliente>());
	}
}