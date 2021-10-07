package org.pmoo.packlaboratorio3;

public interface IComplejo
{
  public abstract double getParteImaginaria();
  public abstract double getParteReal();
  public abstract double getAngulo();
     /*(devuelve el ángulo en grados, NO en radianes)*/
  public abstract double getModulo();
  public abstract IComplejo sumar(IComplejo pNumComp);
  public abstract IComplejo multiplicar(IComplejo pNumComp);
  public abstract boolean esIgual(IComplejo pNumComp);
}
