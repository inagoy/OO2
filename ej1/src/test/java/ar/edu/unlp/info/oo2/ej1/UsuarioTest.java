package ar.edu.unlp.info.oo2.ej1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	Usuario usuario;
	@BeforeEach
	void setUp() throws Exception {
		usuario = new Usuario("juan");
	}
	@Test
	public void testCrearUsuario() {
		assertEquals(0, usuario.getTwitts().size());
		assertEquals("juan", usuario.getScreenName());
	}
}
