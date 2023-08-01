package ar.edu.unlp.info.oo2.ej14_repaso;

public class Extension extends Decorador {

	public Extension(FileOO2 componente) {
		super(componente);
	}
	
	@Override
	public String prittyPrint() {
		return super.prittyPrint() + "*Extensión: " + this.getExtension() + " MB" +"\r\n";
	}

}

