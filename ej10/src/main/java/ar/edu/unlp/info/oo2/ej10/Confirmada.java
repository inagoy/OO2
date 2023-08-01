package ar.edu.unlp.info.oo2.ej10;

public class Confirmada extends Etapa {

	public Confirmada(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	protected void aprobarEtapa() {

	}

	@Override
	protected boolean modificarMargenDeGanancia(double margenDeGanancia) {
		return false;
	}

}
