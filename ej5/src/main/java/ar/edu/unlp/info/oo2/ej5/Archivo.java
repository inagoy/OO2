package ar.edu.unlp.info.oo2.ej5;

import java.time.LocalDate;

public class Archivo extends FileSystem {
	private int tamano;
	public Archivo(String nombre, LocalDate fechaCreacion, int tamano) {
		super(nombre, fechaCreacion);
		this.tamano=tamano;
	}
	
	@Override
	public int tamanoTotalOcupado() {
		return this.tamano;
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}
	
}
