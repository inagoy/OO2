package ar.edu.unlp.info.oo2.ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	Twitter twitter;
	@BeforeEach
	void setUp() throws Exception {
		twitter = new Twitter();
	}	
	
    @Test
    public void testCrearUsuario() {
    	assertEquals("juan", twitter.crearUsuario("juan").getScreenName());
    	assertNull(twitter.crearUsuario("juan"));
    	assertEquals(1, twitter.getUsuarios().size());
    }	
}
