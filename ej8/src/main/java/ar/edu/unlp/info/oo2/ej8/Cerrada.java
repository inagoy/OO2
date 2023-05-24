package ar.edu.unlp.info.oo2.ej8;

public class Cerrada extends State {

	public Cerrada(Excursion excursion) {
		super(excursion);
		}

	@Override
	public void inscribir(Usuario usuario) {
		this.excursion.agregarEnEspera(usuario);

	}

}
