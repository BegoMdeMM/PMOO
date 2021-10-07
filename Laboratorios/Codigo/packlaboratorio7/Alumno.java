package org.pmoo.packlaboratorio7;

public abstract class Alumno extends Object
{
	// atributos
	private String dni;
	private String nombre;
	private String apellido;
	private int edad;
	//private ArrayList<Alumno>listaPreferencias;
	private ListaAlumnos listaPreferencias;

	
	// constructora
	
	public Alumno(String pDNI, String pNombre, String pApellido, int pEdad)
	{
		dni = pDNI;
        nombre = pNombre;
        apellido = pApellido;
        edad = pEdad;
        listaPreferencias = new ListaAlumnos(); 
	}

	// getters y setters
	

	/**
	 * 
	 * @return la lista de preferencias del alumno
	 */
	protected ListaAlumnos getListaPreferencias()
	{
		return this.listaPreferencias;
	}


	/**
	 * 
	 * @return el nombre del alumno
	 */
	public String getNombre()
	{
		return this.nombre;
	}

	/**
	 * 
	 * @return el apellido del alumno
	 */
	public String getApellido()
	{
		return this.apellido;
	}

	/**
	 * 
	 * @return la edad del alumno
	 */
	public int getEdad()
	{
		return this.edad;
	}

	/**
	 *  
	 * @return el dni del alumno
	 */
	public String getDNI()
	{
		return this.dni;
	}

	// otros métodos
	
	// hace falta cabecera aunque no se implemente.
	public abstract void anadirPreferencia(Alumno pAlumno);
}

