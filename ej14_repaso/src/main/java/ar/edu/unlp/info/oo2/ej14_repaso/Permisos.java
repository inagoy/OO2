package ar.edu.unlp.info.oo2.ej14_repaso;

public class Permisos extends Decorador {

	public Permisos(FileOO2 componente) {
		super(componente);
	}
	
	@Override
	public String prittyPrint() {
		return super.prittyPrint() + "*Permisos: " + this.getPermisos() + "\r\n";
	}

}
