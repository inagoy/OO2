package ar.edu.unlp.info.oo2.ej14_repaso;

public class Nombre extends Decorador {

	public Nombre(FileOO2 componente) {
		super(componente);
	}
	
	@Override
	public String prittyPrint() {
		return super.prittyPrint() + "*Nombre: " + this.getNombre() + "\r\n";
	}
}
