package ar.edu.unlp.info.oo2.facturacion_llamadas_refactory;

public abstract class Llamada {
	protected int duracion;
	private String telefonoRemitente;
	private String telefonoEmisor;
	public Llamada(String telefonoEmisor, String telefonoRemitente,int duracion) {
		this.telefonoRemitente = telefonoRemitente;
		this.telefonoEmisor = telefonoEmisor;
		this.duracion = duracion;
	}
	
	public String getNumeroRemitente() {
		return telefonoRemitente;
	}

	public String getTelefonoEmisor() {
		return telefonoEmisor;
	}

	public double calcularPrecio() {
		return (this.duracion * this.getFactorCosto() + 
				(this.duracion * this.getFactorCosto() * 0.21));
	}
	protected abstract double getFactorCosto();

}
