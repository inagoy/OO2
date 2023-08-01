package ar.edu.unlp.info.oo2.ej5;

import java.time.LocalDate;

public abstract class FileSystem {
	protected String nombre;
	protected LocalDate fechaCreacion;
	
	public FileSystem(String nombre, LocalDate fechaCreacion) {
		this.nombre = nombre;
		this.fechaCreacion=fechaCreacion;
	}
	
	public LocalDate getFechaCreacion() {
		return this.fechaCreacion;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public abstract int tamanoTotalOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
}
