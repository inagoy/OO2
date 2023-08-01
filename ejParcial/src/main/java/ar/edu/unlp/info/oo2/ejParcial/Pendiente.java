package ar.edu.unlp.info.oo2.ejParcial;

public class Pendiente extends Estado{
	
	public Pendiente(Excursion excursion) {
		super(excursion);
	}
	
	protected void inscribir(Usuario usuario) {
		this.excursion.getInscriptos().add(usuario);
		if (this.excursion.getInscriptos().size() == this.excursion.getCupoMin())
			this.excursion.setEstado(new Definitiva(this.excursion));
	}
	protected String obtenerInformacionAdicional() {
		return Integer.toString(this.excursion.getCupoMin() - this.excursion.getInscriptos().size());
	}
}
