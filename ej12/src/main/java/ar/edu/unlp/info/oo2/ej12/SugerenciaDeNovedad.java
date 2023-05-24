package ar.edu.unlp.info.oo2.ej12;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaDeNovedad extends Sugerencia {
	
	public SugerenciaDeNovedad(Decodificador decodificador) {
		super(decodificador);
	}

	@Override
	protected List<Pelicula> sugerir(Decodificador decodificador) {
		return this.decodificador.getGrilla().stream()
				.sorted((p2, p1) -> p1.getLanzamiento().compareTo(p2.getLanzamiento()))
				.collect(Collectors.toList());
	}

}
