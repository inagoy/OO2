package ar.edu.unlp.info.oo2.biblioteca;


import static org.junit.Assert.assertEquals;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	
	Biblioteca biblioteca;
	
	@BeforeEach
	void setUp() throws Exception{
		biblioteca = new Biblioteca();
		biblioteca.setExporter(new Exporter());
	}
	@Test
	void CrearBibliotecaTest() throws ParseException {
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));	
		String texto = "[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"nombre\": \"Tyron Lannister\",\n"
				+ "		\"email\": \"tyron@thelannisters.com\",\n"
				+ "		\"legajo\": \"2345-2\"\n"
				+ "	}\n"
				+ "]";
		JSONParser parser = new JSONParser();
		assertEquals(parser.parse(texto), parser.parse(biblioteca.exportarSocios()));
	}

}
