package ar.edu.unlp.info.oo2.ejParcial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion{
	
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;
	private List<Usuario> inscriptos;
	private List<Usuario> enEspera;
	private Estado estado;
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro,
			double costo, int cupoMin, int cupoMax) {
		this.nombre = nombre;
		this.fechaFin = fechaFin;
		this.fechaInicio = fechaInicio;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMax = cupoMax;
		this.cupoMin=cupoMin;
		this.inscriptos = new ArrayList<>();
		this.enEspera = new ArrayList<>();
		this.estado = new Pendiente(this);
	}
	
	public String obtenerInformacion() {
		return this.estado.obtenerInformacion();
	}
	
	public void inscribir(Usuario usuario) {
		this.estado.inscribir(usuario);
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public List<Usuario> getEnEspera() {
		return enEspera;
	}

	public int getCupoMax() {
		return cupoMax;
	}

	public int getCupoMin() {
		return cupoMin;
	}
	protected void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public double getCosto() {
		return costo;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public String getMails() {
	    StringBuilder resultado = new StringBuilder();
	    this.inscriptos.stream()
	        .forEach(i -> resultado.append(i.getMail()));
	    return resultado.toString();
	}
	
}
