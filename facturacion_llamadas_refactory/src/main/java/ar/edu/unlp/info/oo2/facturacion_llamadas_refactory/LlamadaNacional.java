package ar.edu.unlp.info.oo2.facturacion_llamadas_refactory;

public class LlamadaNacional extends Llamada {
	private static int factorCosto = 3;
	
	public LlamadaNacional(String telefonoEmisor, String telefonoRemitente, double duracion) {
		super(telefonoEmisor, telefonoRemitente, duracion);
	}
	
	@Override
	public double getFactorCosto() {
		return LlamadaNacional.factorCosto;
	}

}
