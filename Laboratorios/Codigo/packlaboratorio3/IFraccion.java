package org.pmoo.packlaboratorio3;

public interface IFraccion
{
  public abstract int getNumerador();
  public abstract void setNumerador(int pNumerador);
  public abstract int getDenominador();
  public abstract void setDenominador(int pDenominador);
  public abstract Fraccion simplificar();
  public abstract Fraccion sumar (Fraccion pFraccion);
  public abstract Fraccion restar (Fraccion pFraccion);
  public abstract Fraccion multiplicar (Fraccion pFraccion);
  public abstract Fraccion dividir (Fraccion pFraccion);
  public abstract boolean esIgualQue(Fraccion pFraccion);
  public abstract boolean esMayorQue(Fraccion pFraccion);
  public abstract boolean esMenorQue(Fraccion pFraccion);
  public abstract boolean esMayorOIgualQue(Fraccion pFraccion);
  public abstract boolean esMenorOIgualQue(Fraccion pFraccion);
}
