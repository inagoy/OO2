package ar.edu.unlp.info.oo2.ej14_repaso;

public class Tamaño extends Decorador {

	public Tamaño(FileOO2 componente) {
		super(componente);
	}
	
	@Override
	public String prittyPrint() {
		return super.prittyPrint() + "*Tamaño: " + this.getTamaño() + " MB" + "\r\n";
	}

}
