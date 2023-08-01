package ar.edu.unlp.info.oo2.ej6;

public class Temporario extends Empleado{
	
	private int cantHorasTrabajo;
	
	public Temporario(int cantHijos, boolean esCasado, int cantHorasTrabajo) {
		super(cantHijos, esCasado);
		this.cantHorasTrabajo = cantHorasTrabajo;
	}
	@Override
	protected double sueldoBasico() {
		return 20000 + this.cantHorasTrabajo * 300;
	}

	@Override
	protected double sueldoAdicional() {
		double sueldoHijos = 2000 * this.cantHijos;
		return this.esCasado ? sueldoHijos + 5000 : sueldoHijos;
	}
	
}
