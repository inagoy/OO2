package ar.edu.unlp.info.oo2.ej8;

public class Provisoria extends State {

	public Provisoria(Excursion excursion) {
		super(excursion);
	}

	@Override
	public void inscribir(Usuario usuario) {
		this.excursion.agregarInscripto(usuario);;
		if (this.excursion.usuarioFaltantes() == 0) {
			this.excursion.setEstado(new Definitiva(this.excursion));
		}

	}

	@Override
	public String mostrarInfo() {
		return super.mostrarInfo() + this.excursion.usuarioFaltantes();
	}

}
