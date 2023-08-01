package ar.edu.unlp.info.oo2.facturacion_llamadas_refactory;

public class LlamadaNacional extends Llamada {
	private static final int factorCostoNacional = 3;
	
	public LlamadaNacional(String telefonoEmisor, String telefonoRemitente, int duracion) {
		super(telefonoEmisor, telefonoRemitente, duracion);
	}
	
	@Override
	public double getFactorCosto() {
		return LlamadaNacional.factorCostoNacional;
	}

}
