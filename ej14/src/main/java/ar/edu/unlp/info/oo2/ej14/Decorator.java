package ar.edu.unlp.info.oo2.ej14;

import java.time.LocalDate;

public  abstract class Decorator implements FileOO2{
	protected FileOO2 component;
	
	public Decorator(FileOO2 component) {
		this.component = component;
	}

	@Override
	public String prettyPrint() {
		return this.component.prettyPrint();
	}

	@Override
	public String getName() {
		return this.component.getName();
	}

	@Override
	public String getExtension() {
		return this.component.getExtension();
	}

	@Override
	public double getSize() {
		return this.component.getSize();
	}

	@Override
	public LocalDate getCreatedDate() {
		return this.component.getCreatedDate();
	}

	@Override
	public LocalDate getModifiedDate() {
		return this.component.getModifiedDate();
	}

	@Override
	public String getPermissions() {
		return this.component.getPermissions();
	}
	
	
}
