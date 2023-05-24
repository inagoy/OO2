package ar.edu.unlp.info.oo2.ej14;

public class CreatedDateDecorator extends Decorator{

	public CreatedDateDecorator(FileOO2 component) {
		super(component);
	}
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + " " + this.getCreatedDate();
	}
}
