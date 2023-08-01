package ar.edu.unlp.info.oo2.ej5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends FileSystem {
	private List<FileSystem> fileSystems;
	public Directorio(String nombre, LocalDate fechaCreacion) {
		super(nombre, fechaCreacion);
		this.fileSystems = new ArrayList<>();
	}
	
	public void agregar(FileSystem fileSystem) {
		this.fileSystems.add(fileSystem);
	}
	
	@Override
	public int tamanoTotalOcupado() {
		return 32 + this.fileSystems.stream()
					.mapToInt(f->f.tamanoTotalOcupado())
					.sum();
	}

	@Override
	public Archivo archivoMasGrande() {
		return this.fileSystems.stream()
				.map(f -> f.archivoMasGrande())
				.max((a1,a2) -> Integer.compare(a1.tamanoTotalOcupado(), a2.tamanoTotalOcupado()))
				.orElse(null);
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this.fileSystems.stream()
				.map(f -> f.archivoMasNuevo())
				.max((a1,a2) -> a1.getFechaCreacion().compareTo(a2.getFechaCreacion()))
				.orElse(null);
	}

}
