package ar.edu.unlp.info.oo2.ej14;

import java.time.LocalDate;

public class File implements FileOO2 {
	private String name;
	private String extension;
	private String permisions;
	private double size;
	private LocalDate created;
	private LocalDate modified;
	
	public File(String name, String extension, String permisions, 
			double size) {
		this.name = name;
		this.extension = extension;
		this.permisions = permisions;
		this.size = size;
		this.created = LocalDate.now();
		this.modified = LocalDate.now();
	}
	
	@Override
	public String prettyPrint() {
		return "Datos: \n";
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getExtension() {
		return this.extension;
	}

	@Override
	public double getSize() {
		return this.size;
	}

	@Override
	public LocalDate getCreatedDate() {
		return this.created;
	}

	@Override
	public LocalDate getModifiedDate() {
		return this.modified;
	}

	@Override
	public String getPermissions() {
		return this.permisions;
	}

}
