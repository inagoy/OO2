package ar.edu.unlp.info.oo2.ej14_repaso;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOO2Test {
	FileOO2 file;
	FileOO2 nombreDecorador;
	FileOO2 modificacionDecorador;
	FileOO2 tamañoDecorador;
	
	@BeforeEach
	void setUp() throws RuntimeException{
		LocalDateTime fecha = LocalDateTime.of(2023, 1, 1, 0, 0);
		file = new FileManager("Archivo", "rwx", ".jpg", 100, fecha, fecha);
		nombreDecorador = new Nombre(file);
		modificacionDecorador = new FechaModificacion(nombreDecorador);
		tamañoDecorador = new Tamaño(modificacionDecorador);
	}
	
	@Test
	void prittyPrintTest() {
		String textoEsperado="Datos: \r\n"
				+ "*Nombre: Archivo\r\n"
				+ "*Fecha de Modificación: 2023-01-01T00:00\r\n"
				+ "*Tamaño: 100.0 MB\r\n";
		assertEquals(textoEsperado, tamañoDecorador.prittyPrint());
	}
}
