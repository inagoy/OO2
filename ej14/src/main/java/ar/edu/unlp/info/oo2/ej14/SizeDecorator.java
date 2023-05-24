package ar.edu.unlp.info.oo2.ej14;

public class SizeDecorator extends Decorator {

	public SizeDecorator(FileOO2 component) {
		super(component);
	}
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + " " + this.getSize() + " MB";
	}
}