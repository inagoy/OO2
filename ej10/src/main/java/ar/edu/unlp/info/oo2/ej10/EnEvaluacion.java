package ar.edu.unlp.info.oo2.ej10;

public class EnEvaluacion extends Etapa {

	public EnEvaluacion(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	protected void aprobarEtapa() {
		this.proyecto.setEtapa(new Confirmada(this.proyecto));

	}

	@Override
	protected boolean modificarMargenDeGanancia(double margenDeGanancia) {
		return (margenDeGanancia>= 0.11 && margenDeGanancia <= 0.15);
	}

}
