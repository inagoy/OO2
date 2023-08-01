package ar.edu.unlp.info.oo2.ej6;

public class Planta extends Empleado{
	private int añosAntiguedad;
	
	public Planta(int cantHijos, boolean esCasado, int añosAntiguedad) {
		super(cantHijos, esCasado);
		this.añosAntiguedad = añosAntiguedad;
	}
	@Override
	protected double sueldoBasico() {
		return 50000;
	}

	@Override
	protected double sueldoAdicional() {
		double sueldoAux = 2000 * this.cantHijos + 2000 * this.añosAntiguedad;
		return this.esCasado ? sueldoAux + 5000 : sueldoAux;
	}
	
}
