package org.pmoo.packlaboratorio7;

public class Mujer extends Alumno
{
	// constructora
	/**
	 * @param pDNI
	 * @param pNombre
	 * @param pApellido
	 * @param pEdad
	 *            post: invoca a la constructora de la superclase para
	 *            instanciar un alumno Mujer
	 */
	public Mujer(String pDNI, String pNombre, String pApellido, int pEdad)
	{
		super(pDNI, pNombre, pApellido, pEdad);
	}
	
// otros métodos
	
	/**
	 * 
	 * @param pHombreDisponibles
	 * @return devuelve el primer Hombre de los que hay en la lista de alumnos
	 *         pHombresDisponibles que se encuentre en la lista de preferencias
	 *         de la mujer. Si no existiera tal hombre, se devuelve el objeto
	 *         null. Si en la lista de alumnos pHombresDisponibles se encuentra
	 *         alguna mujer, se muestra un aviso por consola y se devuelve null.
	 */
	public Hombre emparejar(ListaAlumnos pHombreDisponibles)
	{
		int i=0;
		Hombre bailarin=null;
		boolean excepcion=false;
		int tamano=pHombreDisponibles.getTamano();
		
		for (i=0;i<tamano||(excepcion);i=i+1)
		{
			excepcion=false;
			if(pHombreDisponibles.getAlumnoEnPos(i) instanceof Mujer)
			{
				System.out.print("Hay una mujer en la lista de hombres");
				bailarin=null;
				excepcion=true;
			}
			else
			{
                if (this.getListaPreferencias().esta(pHombreDisponibles.getAlumnoEnPos(i)))
                {
				bailarin=(Hombre)pHombreDisponibles.getAlumnoEnPos(i);
                }
			}
		}
		return bailarin;
	}

	/**
	 * @param pAlumno
	 *            post: si el parámetro pAlumno es una instancia de Hombre, la
	 *            añade a la lista de preferencias de la mujer si no, muestra un
	 *            mensaje de aviso por pantalla y no modifica la lista de
	 *            preferencias.
	 */
	public void anadirPreferencia(Alumno pAlumno)
	{
		if (pAlumno instanceof Mujer)
		{
			System.out.print("Los alumnos no son de sexo opuesto"); 
		}
		else
		{
			super.getListaPreferencias().anadirAlumno(pAlumno);
		}		
	}
}
