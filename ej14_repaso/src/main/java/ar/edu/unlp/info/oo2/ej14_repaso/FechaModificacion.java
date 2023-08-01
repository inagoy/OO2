package ar.edu.unlp.info.oo2.ej14_repaso;

public class FechaModificacion extends Decorador {

	public FechaModificacion(FileOO2 componente) {
		super(componente);
	}
	
	@Override
	public String prittyPrint() {
		return super.prittyPrint() + "*Fecha de Modificación: " + this.getFechaModificacion() + "\r\n";
	}

}
