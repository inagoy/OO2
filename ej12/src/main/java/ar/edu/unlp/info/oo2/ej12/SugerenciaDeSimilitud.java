package ar.edu.unlp.info.oo2.ej12;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaDeSimilitud extends Sugerencia{

	public SugerenciaDeSimilitud(Decodificador decodificador) {
		super(decodificador);
	}

	@Override
	protected List<Pelicula> sugerir(Decodificador decodificador) {
		return this.decodificador.getReproducidas().stream()
			.map(p -> p.getSimilares())
			.flatMap(List :: stream)
			.collect(Collectors.toList());
	}

}
