package ar.edu.unlp.info.oo2.ej10;

public abstract class Etapa {
	protected Proyecto proyecto;
	
	public Etapa(Proyecto proyecto) {
		this.proyecto=proyecto;
	}
	
	protected abstract void aprobarEtapa();
	protected abstract boolean modificarMargenDeGanancia(double margenDeGanancia);
}
