package ar.edu.unlp.info.oo2.ej8;

public class Definitiva extends State {

	public Definitiva(Excursion excursion) {
		super(excursion);
		
	}

	@Override
	public void inscribir(Usuario usuario) {
		this.excursion.agregarInscripto(usuario);
		if (this.excursion.usuarioFaltantesMax() == 0) {
			this.excursion.setEstado(new Cerrada(this.excursion));
		}	
	}

	@Override
	public String mostrarInfo() {
		return (super.mostrarInfo() + this.excursion.getMailInscriptos() + " - "
		+ this.excursion.usuarioFaltantesMax());
	}

}
