package ar.edu.unlp.info.oo2.ej10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private double montoPagaDia;
	private int nroIntegrantes;
	private double margenGanancia;
	private Etapa etapa;
	
	public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin,
			String objetivo,double montoPagaDia,int nroIntegrantes) {
		
		this.nombre=nombre;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
		this.objetivo=objetivo;
		this.montoPagaDia=montoPagaDia;
		this.nroIntegrantes=nroIntegrantes;
		this.margenGanancia = 0.07;
		this.etapa = new EnConstruccion(this);
	}
	
	public void aprobarEtapa() {
		this.etapa.aprobarEtapa();
	}
	public void modificarMargenDeGanancia(double margenDeGanancia) {
		if (this.etapa.modificarMargenDeGanancia(margenDeGanancia)) {
			this.margenGanancia = margenDeGanancia;
		};
	}
	public double costo() {
		return ChronoUnit.DAYS.between(this.fechaInicio,this.fechaFin) 
				* this.montoPagaDia * this.nroIntegrantes;
	}
	
	public double precio() {
		return this.costo() + this.costo() * this.margenGanancia;
	}
	
	public void cancelar() {
		if (!this.objetivo.contains("(Cancelado)")) {
			this.objetivo+= " (Cancelado)";
		}
	}
	
	protected void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}
	
	protected Etapa getEtapa() {
		return this.etapa;
	}

	public String getNombre() {
		return nombre;
	}

	public String getObjetivo() {
		return this.objetivo;
	}
}
