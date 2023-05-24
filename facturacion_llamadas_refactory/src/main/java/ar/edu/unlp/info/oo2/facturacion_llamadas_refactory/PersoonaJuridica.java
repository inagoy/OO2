package ar.edu.unlp.info.oo2.facturacion_llamadas_refactory;

public class PersoonaJuridica extends Persoona {
	private static double descuento = 0.15;
	private String cuit;
	private String nombreFantasia;
	public PersoonaJuridica(String cuit, String nombreFantasia) {
		super();
		this.cuit = cuit;
		this.nombreFantasia = nombreFantasia;
	}

	@Override
	protected double getDescuento() {
		return PersoonaJuridica.descuento;
	}

	public String getCuit() {
		return cuit;
	}

	public String getNombreFantasia() {
		return nombreFantasia;
	}

}
