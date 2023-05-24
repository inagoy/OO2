package ar.edu.unlp.info.oo2.ej14;

public class NameDecorator extends Decorator {
	public NameDecorator(FileOO2 component) {
		super(component);
	}
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + " " + this.getName();
	}
}
