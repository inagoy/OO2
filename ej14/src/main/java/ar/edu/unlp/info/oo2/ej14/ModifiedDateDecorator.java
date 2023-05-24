package ar.edu.unlp.info.oo2.ej14;

public class ModifiedDateDecorator extends Decorator {

	public ModifiedDateDecorator(FileOO2 component) {
		super(component);
	}
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + " " + this.getModifiedDate();
	}
}