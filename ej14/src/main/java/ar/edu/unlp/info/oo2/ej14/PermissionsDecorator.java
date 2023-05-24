package ar.edu.unlp.info.oo2.ej14;

public class PermissionsDecorator extends Decorator {

	public PermissionsDecorator(FileOO2 component) {
		super(component);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + " " + this.getPermissions();
	}
}
