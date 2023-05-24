package ar.edu.unlp.info.oo2.ej12;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	private Sugerencia criterio;
	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	
	public Decodificador() {
		this.grilla = new ArrayList<>();
		this.reproducidas= new ArrayList<>();
		this.criterio = new SugerenciaDeNovedad(this);
	}
	
	public void agregarAGrilla(Pelicula pelicula) {
		this.grilla.add(pelicula);
	}
	
	public void agregarAReproducidas(Pelicula pelicula) {
		this.reproducidas.add(pelicula);
	}
	
	public List<Pelicula> recomendar(){
		return this.criterio.obtenerSugerencias();
	}
	
	public List<Pelicula> getGrilla(){
		return this.grilla;
	}
	
	public List<Pelicula> getReproducidas(){
		return this.reproducidas;
	}
	public void setCriterio(Sugerencia criterio) {
		this.criterio= criterio;
	}
}

