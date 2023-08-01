package ar.edu.unlp.info.oo2.ej14_repaso;

public class FechaCreacion extends Decorador {

	public FechaCreacion(FileOO2 componente) {
		super(componente);
	}
	
	@Override
	public String prittyPrint() {
		return super.prittyPrint() + "*Fecha de Creación: " + this.getFechaModificacion() + "\r\n";
	}
}
