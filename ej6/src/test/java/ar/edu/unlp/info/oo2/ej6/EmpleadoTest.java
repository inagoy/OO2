package ar.edu.unlp.info.oo2.ej6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	
	Empleado temporario;
	// Continuar test con el resto de los empleados
	
	@BeforeEach
	void setUp() throws Exception {
		temporario = new Temporario(2,true,8);
	}
	
	@Test
	void testDescuento() {
		assertEquals((20000 + 8 * 300) * 0.13 + (5000 +(2*2000)) * 0.05,this.temporario.descuento());
	}
	
	@Test
	void testSueldo() {
		assertEquals((20000 + 8 * 300)+(5000 +(2*2000))-((20000 + 8 * 300) * 0.13 + (5000 +(2*2000)) * 0.05),this.temporario.sueldo());
	}

}
