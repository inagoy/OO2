package ar.edu.unlp.info.oo2.ejParcial;

public abstract class Estado {
	protected Excursion excursion;
	
	public Estado(Excursion excursion) {
		this.excursion= excursion;
	}
	
	protected abstract String obtenerInformacionAdicional();
	
	protected String obtenerInformacion() {
		return this.excursion.getNombre() + " " + this.excursion.getCosto() + " " 
	+ this.excursion.getFechaInicio() + " " + this.obtenerInformacionAdicional();
	}
	
	protected abstract void inscribir(Usuario usuario);
}
