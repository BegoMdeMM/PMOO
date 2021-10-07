package org.pmoo.packlaboratorio7;

import java.util.*;

public class ListaParejas
{
	ArrayList<Pareja> lista;
	private static ListaParejas miListaParejas = new ListaParejas();


	// constructora
	private ListaParejas()
	{
		this.lista=new ArrayList<Pareja>();
	}

	// getters y setters

	/**
	 * @return la Ãºnica instancia de ListaParejas
	 */
	public static ListaParejas getListaParejas()
	{
		return miListaParejas;
	}

	/**
	 * 
	 * @return la lista de parejas
	 */
	private ArrayList<Pareja> getLista()
	{
		return this.lista;
	}

	/**
	 * 
	 * @return el iterador de la lista de parejas
	 */
	private Iterator<Pareja> getIterador()
	{
		return this.getLista().iterator();
	}

	// otros metodos

	/**
	 * pre: la lista de parejas estÃ¡ ordenada por edad de ella, de mayor a menor
	 * post: se aÃ±ade la pareja pPareja manteniendo el orden PISTA: primero
	 * habrÃ¡ que usar un iterador para buscar en quÃ© posiciÃ³n debe ir la pareja
	 * a aÃ±adir (recuÃ©rdese que la primera posiciÃ³n es la 0) y despuÃ©s aÃ±adirla
	 * usando el mÃ©todo add(index, element).
	 */
	public void anadirOrdenadoPareja(Pareja pPareja)
	{
		Pareja unaPareja=null;
		int i=0;
		boolean esta=false;
		Iterator<Pareja> itr=this.getIterador();
		
		while(itr.hasNext()&& esta)
		    {
		    	unaPareja=itr.next();
		    	if (unaPareja.getElla().getEdad()<pPareja.getElla().getEdad())
		    		{
		    		 this.getLista().add(i, pPareja);
		    		 esta=true;
		    		}
		    	i++;
		    }
	}

	/**
	 * 
	 * @param pAlumno
	 * @return la pareja del alumno pAlumno. Si no existe tal pareja se devuelve
	 *         el valor null.
	 */
	public Alumno obtenerParejaDe(Alumno pAlumno)
	{
		Pareja unaPareja=null;
		Alumno bailarines=null;
		boolean esta=false;
		Iterator<Pareja> itr=this.getIterador();
		
		while (itr.hasNext()&& esta) //Revisar WHILE && o || && el !esta || esta

		{
			unaPareja=itr.next();
			if (unaPareja.esta(pAlumno))
			{
				if (unaPareja.getEl().equals(pAlumno))
					{
					 bailarines= unaPareja.getElla();
					}
				else
					{
					 bailarines=unaPareja.getEl();	
					}
			esta=true;
			 }
		}
		return bailarines;
	}

	/**
	 * post: si ha sido posible, se han reajustado las parejas. Si no ha sido posible,
	 *       la lista de parejas se ha dejado como al principio.
	 *       Se utiliza una lista auxiliar para ir recolocando las parejas en orden descendente de
	 *       edad de la mujer, y una lista con todos los hombres disponibles.
	 *       Para cada mujer, se busca entre la lista de hombres disponibles uno con el que poder emparejarla
	 *       hasta llegar al final de la lista (en cuyo caso se modifica la lista de parejas dejando en su
	 *       lugar la lista de parejas auxiliar) o hasta encontrar una mujer que no se pueda emparejar (en 
	 *       cuyo caso el proceso termina, se muestra un aviso por pantalla y se deja la lista de parejas
	 *       como estaba).
	 * 
	 *       (Ver el enunciado del ejercicio para mÃ¡s detalles sobre el algoritmo de reajuste de
	 *       las parejas.)
	 */
	public void reajustarParejas()
	{
		
		//TODO tampoco...
	}

	/**
	 * vacÃ­a la lista de parejas del curso
	 */
	private void setLista(ArrayList<Pareja> pLista)  	
   	{
   		this.lista=pLista;
   	}
	
	public void resetear()
	{
   		this.setLista(new ArrayList<Pareja>());

	}
}