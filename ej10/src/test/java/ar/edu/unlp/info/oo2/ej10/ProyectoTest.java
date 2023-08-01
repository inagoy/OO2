package ar.edu.unlp.info.oo2.ej10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	
	Proyecto proyecto;
	Proyecto proyectoPrecio0;
	@BeforeEach
	void setUp() throws RuntimeException {
		this.proyecto = new Proyecto("Vacaciones de invierno", LocalDate.of(2023, 6, 15), 
				LocalDate.of(2023, 6, 17), "Salir con amigos",2000,3);
		this.proyectoPrecio0 = new Proyecto("Vacaciones de invierno", LocalDate.of(2023, 6, 15), 
				LocalDate.of(2023, 6, 17), "Salir con amigos",2000,0);
		this.proyecto.aprobarEtapa();
	}
	
	@Test
	void aprobarEtapaTest() {
		assertTrue(this.proyecto.getEtapa() instanceof EnEvaluacion);
		this.proyecto.aprobarEtapa();
		assertTrue(this.proyecto.getEtapa() instanceof Confirmada);
		this.proyecto.aprobarEtapa();
		assertTrue(this.proyecto.getEtapa() instanceof Confirmada);
		
		assertThrows(RuntimeException.class, () -> {this.proyectoPrecio0.aprobarEtapa();});	
	}
	@Test
	void costoTest() {
		assertEquals(2 * 2000 * 3, proyecto.costo());
		assertEquals(0, proyectoPrecio0.costo());
	}
	@Test
	void PreciYmodificarMargenDeGananciaTest() {
		proyecto.modificarMargenDeGanancia(0.11);
		assertEquals(2 * 2000 * 3 + 2 * 2000 * 3 * 0.11, proyecto.precio());
		proyecto.modificarMargenDeGanancia(0.10);
		assertEquals(2 * 2000 * 3 + 2 * 2000 * 3 * 0.11, proyecto.precio());
		assertEquals(0, proyectoPrecio0.precio());
	}
	@Test
	public void testCancelarProyecto() {
		this.proyecto.cancelar();
		assertEquals("Salir con amigos (Cancelado)",this.proyecto.getObjetivo());
		this.proyecto.cancelar();
		assertEquals("Salir con amigos (Cancelado)",this.proyecto.getObjetivo());
	}	
	
}
