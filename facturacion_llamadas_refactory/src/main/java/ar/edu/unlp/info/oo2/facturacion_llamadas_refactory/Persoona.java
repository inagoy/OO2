package ar.edu.unlp.info.oo2.facturacion_llamadas_refactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
	
	private String telefono;
	private List<Llamada> llamadas;
	
	public Persoona() {
		this.llamadas = new ArrayList<>();
	}
	
	private void registrarLlamada(Llamada unaLlamada) {
		this.llamadas.add(unaLlamada);
	}
	public Llamada registrarLlamadaNacional(Persoona remitente, int duracion) {
		Llamada llamada = new LlamadaNacional(this.getTelefono(), remitente.getTelefono(), duracion);
		this.registrarLlamada(llamada);
		return llamada;
	}
	public Llamada registrarLlamadaInternacional(Persoona remitente, int duracion) {
		Llamada llamada = new LlamadaInternacional(this.getTelefono(), remitente.getTelefono(), duracion);
		this.registrarLlamada(llamada);
		return llamada;
	}	
	
	public double calcularMonto(Llamada unaLlamada) {
		return (unaLlamada.calcularPrecio() - unaLlamada.calcularPrecio()* this.getDescuento());
	}
	
	public double calcularMontoTotalLlamadas() {
		return this.llamadas.stream()
				.mapToDouble(llamada -> calcularMonto(llamada))
				.sum();
			
	}
	protected abstract double getDescuento();

	public String getTelefono() {
		return telefono;
	}

	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
