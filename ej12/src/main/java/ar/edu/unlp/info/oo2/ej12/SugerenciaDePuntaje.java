package ar.edu.unlp.info.oo2.ej12;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaDePuntaje extends Sugerencia {

	public SugerenciaDePuntaje(Decodificador decodificador) {
		super(decodificador);
	}

	@Override
	protected List<Pelicula> sugerir(Decodificador decodificador) {
		return this.decodificador.getGrilla().stream()
				.sorted(Comparator.comparingDouble(Pelicula::getPuntaje)
						.thenComparing(Pelicula::getLanzamiento)
						.reversed())
				.collect(Collectors.toList());
	}

}
