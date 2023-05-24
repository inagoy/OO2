package ar.edu.unlp.info.oo2.ej14;

public class ExtensionDecorator extends Decorator {

	public ExtensionDecorator(FileOO2 component) {
		super(component);
	}
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + " " + this.getExtension();
	}
}
