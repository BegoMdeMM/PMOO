package org.pmoo.packlaboratorio6;

public class CDestino extends Complementos
{
	protected String Ciudad;
	protected int Sucursal;
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public int getSucursal() {
		return Sucursal;
	}
	public void setSucursal(int sucursal) {
		Sucursal = sucursal;
	}
	public static int getImpuesto() {
		return impuesto;
	}
	public static void setImpuesto(int impuesto) {
		CDestino.impuesto = impuesto;
	}
	protected static int impuesto=50;

}
