package ar.edu.unlp.info.oo2.ej14_repaso;

import java.time.LocalDateTime;

public abstract class Decorador implements FileOO2 {
	protected FileOO2 componente;
	
	public Decorador(FileOO2 componente) {
		this.componente = componente;
	}
	
	@Override
	public String prittyPrint() {
		return this.componente.prittyPrint();
	}

	@Override
	public String getNombre() {
		return this.componente.getNombre();
	}

	@Override
	public String getExtension() {
		return this.componente.getExtension();
	}

	@Override
	public String getPermisos() {
		return this.componente.getPermisos();
	}

	@Override
	public LocalDateTime getFechaCreacion() {
		return this.componente.getFechaCreacion();
	}

	@Override
	public LocalDateTime getFechaModificacion() {
		return this.componente.getFechaModificacion();
	}

	@Override
	public double getTamaño() {
		return this.componente.getTamaño();
	}

}
