package ar.edu.unlp.info.oo2.ej21;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MamiferoTest {
	Mamifero hijo;
	Mamifero padre;
	Mamifero madre;
	Mamifero abuelo;
	Mamifero nullMamifero;
	
	@BeforeEach
	void setUp() throws RuntimeException{
		this.hijo = new RealMamifero("Juancito");
		this.padre = new RealMamifero("Oscar");
		this.madre = new RealMamifero("Cecilia");
		this.abuelo = new RealMamifero("Ruben");
		this.nullMamifero = new NullMamifero();
		
		hijo.setPadre(padre);
		hijo.setMadre(madre);
		padre.setPadre(abuelo);
		padre.setMadre(nullMamifero);
	}
	
	@Test
	void tieneComoAncestroATest(){
		assertTrue(hijo.tieneComoAncestroA(padre));
		assertTrue(hijo.tieneComoAncestroA(abuelo));
		assertFalse(padre.tieneComoAncestroA(hijo));
		assertFalse(hijo.tieneComoAncestroA(hijo));
	}
}
