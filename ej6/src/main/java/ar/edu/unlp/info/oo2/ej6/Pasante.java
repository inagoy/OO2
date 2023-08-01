package ar.edu.unlp.info.oo2.ej6;

public class Pasante extends Empleado{
	private int cantExamenes;
	
	public Pasante(int cantHijos, boolean esCasado, int cantExamenes) {
		super(cantHijos, esCasado);
		this.cantExamenes = cantExamenes;
	}
	@Override
	protected double sueldoBasico() {
		return 20000;
	}

	@Override
	protected double sueldoAdicional() {
		return this.cantExamenes * 2000;
	}
}