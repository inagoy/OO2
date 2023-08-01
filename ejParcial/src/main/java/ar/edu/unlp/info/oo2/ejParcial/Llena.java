package ar.edu.unlp.info.oo2.ejParcial;

public class Llena extends Estado {

	public Llena(Excursion excursion) {
		super(excursion);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String obtenerInformacionAdicional() {
		return "";
	}

	@Override
	protected void inscribir(Usuario usuario) {
		this.excursion.getEnEspera().add(usuario);
	}

}
