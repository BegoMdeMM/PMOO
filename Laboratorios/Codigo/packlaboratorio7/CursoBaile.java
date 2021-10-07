package org.pmoo.packlaboratorio7;

public class CursoBaile
{
	// atributos
	private static CursoBaile nuevoCurso = new CursoBaile();

	// constructora
	private CursoBaile()
	{

	}

	// getters y setters
	
	/**
	 * @return la única instancia de CursoBaile
	 */
	public static CursoBaile getCursoBaile()
	{
		return nuevoCurso;
	}

	// otros métodos

	
	/**
	 * 
	 * @param pDNI1
	 * @param pDNI2
	 *            post: se da de alta la pareja compuesta por los alumnos cuyos
	 *            DNI son pDNI1 y pDNI2, excepto si el DNI de alguno de los dos
	 *            no se corresponde con el de ningún alumno de la lista de alumnos
	 *            del curso de baile, se trata de dos alumnos del mismo sexo, o
	 *            alguno de ellos ya tiene pareja en el curso, en cuyo caso se
	 *            avisa por pantalla con el mensaje correspondiente y no se da
	 *            de alta la nueva pareja.
	 */
	public void darDeAltaPareja(String pDNI1, String pDNI2)
	{
		// TODO completar
	}

	/**
	 * 
	 * @param pDNI
	 * @param pNombre
	 * @param pApellido
	 * @param pEdad
	 * @param pSexopost
	 *            post: si el carácter pSexo es 'h' o 'H' se da de alta un nuevo
	 *            alumno de tipo Hombre. si el carácter pSexo es 'm' o 'M' se da
	 *            de alta un nuevo alumno de tipo Mujer. El DNI, nombre,
	 *            apellido y edad del nuevo alumno vienen dados por los
	 *            parámetros pDNI, pNombre pApellido y pEdad. si el carácter
	 *            pSexo tiene cualquier otro valor, se avisa por pantalla y no
	 *            se da de alta a ningún alumno.
	 */
	public void darDeAltaAlumno(String pDNI, String pNombre, String pApellido,
			int pEdad, char pSexo)
	{
		Alumno unAlumno;
		if (pSexo=='h'||pSexo=='H')
		{
			unAlumno=new Hombre(pDNI, pNombre, pApellido, pEdad);
			ListaAlumnosCurso.getListaAlumnosCurso().anadirAlumnoCurso(unAlumno);
		}
		else if (pSexo=='m'||pSexo=='M')
		{
			unAlumno=new Mujer(pDNI, pNombre, pApellido, pEdad);
			ListaAlumnosCurso.getListaAlumnosCurso().anadirAlumnoCurso(unAlumno);
		}
		else
		{
			System.out.print("No se ha definido el sexo. No se puede añadir a la lista de alumnos. ");
		}
	}

	/**
	 * 
	 * @param pIdQuien
	 * @param pIdSuPreferencia
	 *            post: se añade el alumno con DNI pIdSuPreferencia a la lista
	 *            de preferencias del alumno con DNI pIdQuien
	 */
	public void anadirPreferencia(String pIdQuien, String pIdSuPreferencia)
	{
		// TODO completar
	}

	/**
	 * post: se resetean las listas de parejas y de alumnos del curso
	 */
	public void empezarCurso()
	{
		ListaAlumnosCurso.getListaAlumnosCurso().resetear();
		ListaParejas.getListaParejas().resetear();
	}

	/**
	 * post: si quedan alumnos sin emparejar se muestra un mensaje por consola,
	 * y si no, se reajustan las parejas del curso.
	 */
	public void ajustarParejasSegunPreferencias()
	{
		if (ListaAlumnosCurso.getListaAlumnosCurso().hayAlumnosSinPareja())
		{
			System.out.print("Hay alumnos sin pareja, imposible reajustar. ");
		}
		else
		{
			ListaParejas.getListaParejas().reajustarParejas();
		}
	}
}