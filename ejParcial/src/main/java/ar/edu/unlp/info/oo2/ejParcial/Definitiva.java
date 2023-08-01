package ar.edu.unlp.info.oo2.ejParcial;

public class Definitiva extends Estado {
	
	public Definitiva(Excursion excursion) {
		super(excursion);
	}

	@Override
	protected String obtenerInformacionAdicional() {
		return this.excursion.getMails() + " " + (this.excursion.getCupoMax()-this.excursion.getInscriptos().size());
	}

	@Override
	protected void inscribir(Usuario usuario) {
		this.excursion.getInscriptos().add(usuario);
		if (this.excursion.getInscriptos().size() == this.excursion.getCupoMax())
			this.excursion.setEstado(new Llena(this.excursion));
		}
	
}
