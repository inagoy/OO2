package ar.edu.unlp.info.oo2.ej6;

public abstract class Empleado {
	
	protected int cantHijos; 
	protected boolean esCasado;
	
	public Empleado(int cantHijos, boolean esCasado) {
		this.cantHijos = cantHijos;
		this.esCasado = esCasado;
	}
	
	public double sueldo() {
		return this.sueldoBasico() + this.sueldoAdicional() - this.descuento(); 
	}
	
	protected abstract double sueldoBasico();
	protected abstract double sueldoAdicional();
	protected double descuento() {
		return this.sueldoBasico() * 0.13 + this.sueldoAdicional() * 0.05;
	}
}
