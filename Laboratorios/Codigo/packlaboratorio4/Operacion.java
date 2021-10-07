package org.pmoo.packlaboratorio4;

public class Operacion 
{
 private int idOperacion;
 private int idCliente;
 private String claveTecleada;
 private double cantidad;
 
	 public Operacion (int pIdOper, int pIdCliente, String pClaveTecleada, double pCant)
	 {
		 this.idOperacion=pIdOper;
		 this.idCliente=pIdCliente;
		 this.claveTecleada=pClaveTecleada;
		 this.cantidad=pCant;
	 }
	 
	 public int getIdOperacion()
	 {
		 return this.idOperacion;
	 }
	 
	 public int getIdCliente()
	 {
		 return this.idCliente;
	 }
	 
	 private String getClaveTecleada()
	 {
		 return this.claveTecleada;
	 }
	 
	 private double getCantidad()
	 {
		 return this.cantidad;
	 }
	 
	 public void realizarOperacion()
		{
			ListaClientes lista = ListaClientes.getListaClientes();
			Cliente clienteReferido = lista.buscarClientePorId(getIdCliente()); 
			if (clienteReferido == null)
			{
				System.out.print("El cliente al que intenta acceder no existe");
			}
			else
			{
				if (clienteReferido.comprobarClave(getClaveTecleada()))
				{
					if (!clienteReferido.getEsPreferente())
					{
						clienteReferido.actualizarSaldo(this.getCantidad() * 1.001);
					}
					else
					{
						clienteReferido.actualizarSaldo(getCantidad());
					}
				}
				else
				{
					System.out.print("Contrasena incorrecta");
				}
			}
		}

	}