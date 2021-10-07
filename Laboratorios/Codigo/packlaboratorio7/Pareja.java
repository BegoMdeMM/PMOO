package org.pmoo.packlaboratorio7;

public class Pareja
{
	// atributos
	Hombre alumno1;
	Mujer alumno2;
	
	// constructora
	/**
	 * 
	 * @param pAlumno1
	 * @param pAlumno2
	 * post: si los alumnos pAlumno1 y pAlumno2 son instancias de un Hombre y de una Mujer (sin importar cuál
	 *       de ellos es el hombre cuál es la mujer - ESTO ES, el orden en el que vengan no importa mientras
	 *       sean uno de cada sexo), se crea una nueva pareja. 
	 *       Si los dos alumnos son del mismo sexo, se muestra un mensaje indicando que no se ha podido crear
	 *       la pareja y se dejan los atributos correspondientes con el valor null.
	 */
	public Pareja(Alumno pAlumno1, Alumno pAlumno2)
	{
		if((pAlumno1 instanceof Hombre && pAlumno2 instanceof Hombre)||(pAlumno1 instanceof Mujer && pAlumno2 instanceof Mujer));
		{
			System.out.print("Esta pareja no se puede crear. ");
		}
		 
			if(pAlumno1 instanceof Hombre)
			{
				this.alumno1=(Hombre)pAlumno1;
				this.alumno2=(Mujer)pAlumno2;
			}
			else
			{
				this.alumno1=(Hombre)pAlumno2;
				this.alumno2=(Mujer)pAlumno1;
			}
	}
	
	// getters y setters
	
	
	/**
	 * 
	 * @return el atributo de tipo Hombre de la pareja
	 */
	public Hombre getEl()
	{
		return this.alumno1;
	}
		
	/**
	 * 
	 * @return el atributo de tipo Mujer de la pareja
	 */
	public Mujer getElla()
	{
		return this.alumno2;
	}
	
	/**
	 * 
	 * @param pAlumno
	 * @return un booleano que indica si el alumno pAlumno es alguno de los miembros de la pareja
	 */
	public boolean esta(Alumno pAlumno)
	{
		if (pAlumno== alumno1 || pAlumno== alumno2)
		{
		return true;
		}
		else 
		{
			return false;
		}
	}
}