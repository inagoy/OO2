package ar.edu.unlp.info.oo2.facturacion_llamadas_refactory;

public class PersoonaFisica extends Persoona {
	private static final double descuentoFisico = 0;
	private String dni;
	private String nombreYApellido;
	
	public PersoonaFisica(String dni, String nombreYApellido) {
		super();
		this.dni = dni;
		this.nombreYApellido = nombreYApellido;
	}

	@Override
	protected double getDescuento() {
		return PersoonaFisica.descuentoFisico;
	}

	public String getDni() {
		return dni;
	}
	public String getNombreYApellido() {
		return nombreYApellido;
	}
}