package org.pmoo.packlaboratorio1;

public class Persona 
{ 
	private String nombreCompleto;
	private int edad;
	private int idPersona;
	private String grupoSanguineo;
	private String nacionalidad;
	
	
	public Persona ()
	{
		this.nombreCompleto = "Nombre desconocido";
		this.edad = 0;
		this.idPersona = 0;
		this.grupoSanguineo = "sangre";
		this.nacionalidad = "Pais";	
	}
	

	public String getNombreCompleto() {
		return this.nombreCompleto;
	}

	public void setNombreCompleto(String pNombreCompleto) {
		this.nombreCompleto = pNombreCompleto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int pEdad) {
		this.edad = pEdad;
	}
	
	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int pIdPersona) {
		this.idPersona = pIdPersona;
	}

	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}

	public void setGrupoSanguineo(String pGrupoSanguineo) {
		this.grupoSanguineo = pGrupoSanguineo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String pNacionalidad) {
		this.nacionalidad = pNacionalidad;
	}
	
	public boolean tieneMismoId (Persona pLaOtraPersona)
	{
		boolean chivato;
		
		if (this.getIdPersona() == pLaOtraPersona.getIdPersona()) 
			{
			chivato = true;
			} 

		else 
			{
			 chivato = false;
			}
		return chivato;
	}
	
	public boolean puedeConducir ()
 
	{
		boolean puede=false;
	
		if (this.getEdad()>=18)
			{
			puede = true;
			}
		else if (this.getNacionalidad().equals("UK") && this.getEdad()>=17)
			 {
			 puede= true;
			 }
			 else if ((this.getNacionalidad().equals("Australia") || this.getNacionalidad().equals("USA")) && this.getEdad()>=16)
				 {
				 puede= true;
				 }
			 	 else if (this.getNacionalidad().equals("Etiopía") && this.getEdad()>=14)
			 	 	 {
					 puede= true;
					 }
		
	return puede;	
	}
	
		public char getInicialNombre ()
		{
		char inicialNombre=this.getNombreCompleto().charAt(0);
		return inicialNombre;
		}
		
		public char getInicialApellido ()
		{
		int index=nombreCompleto.lastIndexOf(' ');
		index=index+1;
		char inicialApellido=this.getNombreCompleto().charAt(index);
		return inicialApellido;
		}
		
		public boolean puedeDonarSangre(Persona pPersona)
		{
		boolean puedeDonar=false;
		if (this.getGrupoSanguineo() == pPersona.getGrupoSanguineo())
		{
		puedeDonar = true;
		}
		else if (this.getGrupoSanguineo().equals("0-"))
			{
			puedeDonar = true;
			}
			else if (this.getGrupoSanguineo().equals("0+") && ( pPersona.getGrupoSanguineo().equals("A+") || pPersona.getGrupoSanguineo().equals("B+") || pPersona.getGrupoSanguineo().equals("AB+")))
				{
				puedeDonar=true;
				}
				else if ((this.getGrupoSanguineo().equals("A+") || this.getGrupoSanguineo().equals("B+") )&& ( pPersona.getGrupoSanguineo().equals("AB+")))
					{
					puedeDonar=true;
					}
					else if (this.getGrupoSanguineo().equals("A-") && ( pPersona.getGrupoSanguineo().equals("A+") || pPersona.getGrupoSanguineo().equals("AB+") || pPersona.getGrupoSanguineo().equals("AB-")))
						{
						puedeDonar=true;
						}
						else if (this.getGrupoSanguineo().equals("B-") && ( pPersona.getGrupoSanguineo().equals("B+") || pPersona.getGrupoSanguineo().equals("AB+") || pPersona.getGrupoSanguineo().equals("AB-")))
							{
							puedeDonar=true;
							}
							else if (this.getGrupoSanguineo().equals("AB+") && ( pPersona.getGrupoSanguineo().equals("AB+")))
								{
								puedeDonar=true;
								}
								else if (this.getGrupoSanguineo().equals("AB-") && ( pPersona.getGrupoSanguineo().equals("AB+") || pPersona.getGrupoSanguineo().equals("AB-")))
									{
									puedeDonar=true;
									}
		return puedeDonar;
		}
}