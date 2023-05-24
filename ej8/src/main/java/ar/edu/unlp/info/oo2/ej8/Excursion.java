package ar.edu.unlp.info.oo2.ej8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;
	private LocalDateTime fechaIni;
	private LocalDateTime fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;
	private State estado;
	private List<Usuario> enEspera;
	private List<Usuario> inscriptos;
	
	
	public Excursion(String nombre, LocalDateTime fechaIni, LocalDateTime fechaFin,
			String puntoEncuentro, double costo, int cupoMin, int cupoMax) {
		
		this.nombre = nombre;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.estado = new Provisoria(this);
		this.enEspera = new ArrayList<>();
		this.inscriptos = new ArrayList<>();
	}
	
	public String mostrarInfo() {
		return this.estado.mostrarInfo();
	}
	public void incribir(Usuario usuario) {
		this.estado.inscribir(usuario);
	}
	
	public List<Usuario> getEnEspera(){
		return this.enEspera;
	}
	public List<Usuario> getinscriptos(){
		return this.enEspera;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public LocalDateTime getFechaIni() {
		return this.fechaIni;
	}
	public LocalDateTime getFechaFin() {
		return this.fechaFin;
	}
	public String getPuntoEncuentro() {
		return this.puntoEncuentro;
	}
	public double getCosto() {
		return this.costo;
	}

	public int getCupoMin() {
		return cupoMin;
	}

	public int getCupoMax() {
		return cupoMax;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}
	public void setEstado(State estado) {
		this.estado = estado;
	}

	public int usuarioFaltantes() {
		return this.cupoMin - this.inscriptos.size();
	}
	public int usuarioFaltantesMax() {
		return this.cupoMax - this.inscriptos.size();
	}
	
	public String getMailInscriptos() {
		return this.inscriptos.stream()
				.map(inscripto -> inscripto.getMail())
				.reduce(", ", (acumulator, element) -> acumulator + "\n" + element);
	}
	
	public void agregarInscripto(Usuario usuario) {
		this.inscriptos.add(usuario);
	}
	public void agregarEnEspera(Usuario usuario) {
		this.enEspera.add(usuario);
	}
}
