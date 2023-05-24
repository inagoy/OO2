package ar.edu.unlp.info.oo2.ej8;

public abstract class State {
	protected Excursion excursion;
	
	public State(Excursion excursion) {
		this.excursion = excursion;
	}
	
	public abstract void inscribir(Usuario usuario);
	public String mostrarInfo() {
		return (this.excursion.getNombre() + " - " +
				this.excursion.getCosto() + " - "  +
				this.excursion.getFechaIni().toString() + " - " +
				this.excursion.getFechaFin().toString() + " - " +
				this.excursion.getPuntoEncuentro() + " - " );
				
	};
	
}
