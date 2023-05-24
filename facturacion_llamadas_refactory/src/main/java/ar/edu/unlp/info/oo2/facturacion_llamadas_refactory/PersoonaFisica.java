package ar.edu.unlp.info.oo2.facturacion_llamadas_refactory;

public class PersoonaFisica extends Persoona {
	private static double descuento = 0;
	private String dni;
	private String nombre;
	private String apellido;
	
	public PersoonaFisica(String dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	protected double getDescuento() {
		return PersoonaFisica.descuento;
	}

	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
}