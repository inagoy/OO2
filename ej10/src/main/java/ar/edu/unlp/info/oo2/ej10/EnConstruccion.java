package ar.edu.unlp.info.oo2.ej10;

public class EnConstruccion extends Etapa {
	
	public EnConstruccion(Proyecto proyecto) {
		super(proyecto);
	}
	@Override
	protected void aprobarEtapa() {
		if (this.proyecto.precio() > 0) {
			this.proyecto.setEtapa(new EnEvaluacion(proyecto));
		}
		else throw new RuntimeException("Solo se puede aprobar si su precio es mayor a 0.");
	}

	@Override
	protected boolean modificarMargenDeGanancia(double margenDeGanancia) {
		return (margenDeGanancia>= 0.08 && margenDeGanancia<= 0.1);
	}

}
