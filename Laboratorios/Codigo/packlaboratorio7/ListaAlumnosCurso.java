package org.pmoo.packlaboratorio7;

import java.util.*;

public class ListaAlumnosCurso
{
	// atributos
	private ArrayList<Alumno>lista;
	private static ListaAlumnosCurso nuevaListaAlumnos = new ListaAlumnosCurso();

	// constructora
	private ListaAlumnosCurso()
	{
		this.lista = new ArrayList<Alumno>();
	}

	// getters y setters
	private void setLista(ArrayList<Alumno> pLista)
	{
		this.lista=pLista;
	}
	

	/**
	 * @return la única instancia de ListaAlumnosCurso
	 */
	public static ListaAlumnosCurso getListaAlumnosCurso()
	{
		return nuevaListaAlumnos;
	}

	/**
	 * 
	 * @return la lista de alumnos del curso
	 */
	private ArrayList<Alumno> getLista()
	{
		return this.lista;
	}

	// otros métodos
	
	/**
	 * 
	 * @param pAlumno
	 *            post: si el alumno no está dado de alta en el curso, lo añade.
	 *            Si no, escribe un mensaje y no hace nada más
	 */
	public void anadirAlumnoCurso(Alumno pAlumno)
	{
		if(this.buscarAlumnoPorDNI(pAlumno.getDNI())==null)
		{
			this.getLista().add(pAlumno);
		}
		else
		{
			System.out.print("El alumno ya está en la lista.");
		}
	}

	/**
	 * 
	 * @return el iterador de la lista de alumnos del curso
	 */
	private Iterator<Alumno> getIterador()
	{
		return this.getLista().iterator();
	}

	/**
	 * vacía la lista de alumnos del curso
	 */
	public void resetear()
	{
		this.setLista(new ArrayList<Alumno>());
	}

	/**
	 * 
	 * @param pDNI
	 * @return el alumno del curso cuyo DNI es pDNI. Si no existe tal alumno,
	 *         devuelve el objeto null.
	 */
	public Alumno buscarAlumnoPorDNI(String pDNI)
	{
		Alumno unAlumno = null;
		boolean esta = false;
		Iterator <Alumno> itr=this.getIterador();
		while (itr.hasNext()&&!esta)
		{
			unAlumno=itr.next();
			if (unAlumno.getDNI()==pDNI)
			{
				esta=true;
			}
		}
		if(esta)
		{
			return unAlumno;
		}
		else
		{
			return null;
		}
	}

	/**
	 * 
	 * @return un booleano que indica si hay algún alumno del curso que no tenga
	 *         pareja en la lista de parejas
	 */
	public boolean hayAlumnosSinPareja()
	{
		boolean noTienePareja=false;
		int i=0;
		Alumno bailarin=null;
		int tamano=this.getLista().size();
		
		for (i=0;i<tamano||noTienePareja;)
		{
			bailarin=this.getLista().get(i);
			if (bailarin!=null)
			{
				i=i+1;
			}
			else
			{
				noTienePareja=true;
			}
		}		
		return noTienePareja;
	}
}