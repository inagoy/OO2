package ar.edu.unlp.info.oo2.facturacion_llamadas_refactory;

public class LlamadaInternacional extends Llamada {
	private static final int factorCostoInternacional = 200;
	
	public LlamadaInternacional(String telefonoEmisor, String telefonoRemitente, int duracion) {
		super(telefonoEmisor, telefonoRemitente, duracion);
	}
	
	@Override
	public double getFactorCosto() {
		return LlamadaInternacional.factorCostoInternacional;
	}

}
