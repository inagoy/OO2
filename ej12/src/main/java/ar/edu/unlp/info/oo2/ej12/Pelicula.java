package ar.edu.unlp.info.oo2.ej12;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo;
	private Year lanzamiento;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String titulo, Year lanzamiento, double puntaje) {
		this.titulo=titulo;
		this.lanzamiento = lanzamiento;
		this.puntaje = puntaje;
		this.similares = new ArrayList<>();
	}
	
	public void agregarSimilar(Pelicula pelicula){
		
		if (!this.similares.contains(pelicula)) {
			this.similares.add(pelicula);
			pelicula.agregarSimilar(this);
		}
	}

	public Year getLanzamiento() {
		return lanzamiento;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getPuntaje() {
		return puntaje;
	}
	
	public List<Pelicula> getSimilares() {
		return this.similares;
	}
	
}
