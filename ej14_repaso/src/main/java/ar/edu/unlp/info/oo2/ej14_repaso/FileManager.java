package ar.edu.unlp.info.oo2.ej14_repaso;

import java.time.LocalDateTime;

public class FileManager implements FileOO2 {
	private String nombre;
	private String permisos;
	private String extension;
	private double tamaño;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaModificacion;
	public FileManager(String nombre, String permisos,String extension, 
			double tamaño, LocalDateTime fechaCreacion, LocalDateTime fechaModificacion) {
		this.nombre=nombre;
		this.permisos=permisos;
		this.extension= extension;
		this.tamaño = tamaño;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		
	}
	@Override
	public String prittyPrint() {
		return "Datos: \r\n";
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String getExtension() {
		return this.extension;
	}

	@Override
	public String getPermisos() {
		return this.permisos;
	}

	@Override
	public LocalDateTime getFechaCreacion() {
		return this.fechaCreacion;
	}

	@Override
	public LocalDateTime getFechaModificacion() {
		return this.fechaModificacion;
	}

	@Override
	public double getTamaño() {
		return this.tamaño;
	}

}
