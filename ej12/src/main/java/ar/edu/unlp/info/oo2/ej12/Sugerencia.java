package ar.edu.unlp.info.oo2.ej12;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Sugerencia {
	protected Decodificador decodificador;
	
	public Sugerencia(Decodificador decodificador) {
		this.decodificador = decodificador;
	}
	
	public List<Pelicula> obtenerSugerencias(){
		List<Pelicula> sugeridas = this.sugerir(this.decodificador);
		return sugeridas.stream()
				.filter(s -> !(this.decodificador.getReproducidas().contains(s)))
				.limit(3)
				.collect(Collectors.toList());
	}

	protected abstract List<Pelicula> sugerir(Decodificador decodificador);
	
}
