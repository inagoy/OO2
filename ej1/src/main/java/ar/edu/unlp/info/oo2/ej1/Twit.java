package ar.edu.unlp.info.oo2.ej1;

public class Twit {
	private String texto;
	private Twit retwit;
	
	public Twit(String texto) {
		this.texto = texto;
		this.retwit=null;
	}
	
	public Twit(String texto, Twit retwit) {
		this.texto=texto;
		this.retwit = retwit;
	}
	
	public void imprimir() {
		if (retwit!=null) System.out.println("Retwit: " + this.retwit.getTexto());
		System.out.print("Twit: " + this.texto);
	}
	
	public String getTexto() {
		return this.texto;
	}
}
