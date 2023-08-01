package ar.edu.unlp.info.oo2.facturacion_llamadas_refactory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersoonalTest {
	
	Persoonal sistema;
	Persoona emisorPersonaFisca, remitentePersonaFisica, emisorPersonaJuridica, remitentePersonaJuridica;
	
	@BeforeEach
	public void setUp() {
		this.sistema = new Persoonal();
		
		this.sistema.agregarTelefono("2214444554");
		this.sistema.agregarTelefono("2214444555");
		this.sistema.agregarTelefono("2214444556");
		this.sistema.agregarTelefono("2214444557");
		
		this.emisorPersonaFisca = sistema.registrarUsuarioFisico("11555666", "Marcelo Tinelli");
		this.remitentePersonaFisica = sistema.registrarUsuarioFisico("00000001", "Mirtha Legrand");
		this.emisorPersonaJuridica = sistema.registrarUsuarioJuridico("17555222", "Felfort");
		this.remitentePersonaJuridica = sistema.registrarUsuarioJuridico("25765432", "Moovistar");
		
		emisorPersonaJuridica.registrarLlamadaNacional(
						remitentePersonaFisica, 10
		);
		emisorPersonaJuridica.registrarLlamadaInternacional(
						remitentePersonaFisica, 8
		);
		emisorPersonaJuridica.registrarLlamadaNacional(
						remitentePersonaJuridica, 5
		);
		emisorPersonaJuridica.registrarLlamadaInternacional(
						remitentePersonaJuridica, 7
		);
		emisorPersonaFisca.registrarLlamadaNacional(
						remitentePersonaFisica, 15
		);	
		emisorPersonaFisca.registrarLlamadaInternacional(
						remitentePersonaFisica, 45
		);	
		emisorPersonaFisca.registrarLlamadaNacional(
						remitentePersonaJuridica, 13
		);	
		emisorPersonaFisca.registrarLlamadaInternacional(
						remitentePersonaJuridica, 17
		);			
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		assertEquals(emisorPersonaFisca.calcularMontoTotalLlamadas(), 15105.640000000001);
		assertEquals(emisorPersonaJuridica.calcularMontoTotalLlamadas(), 3131.7825000000003);
		assertEquals(remitentePersonaFisica.calcularMontoTotalLlamadas(), 0);
		assertEquals(remitentePersonaJuridica.calcularMontoTotalLlamadas(), 0);
	}
	
	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		this.sistema.agregarTelefono("2214444558"); 
		Persoona nuevaPersona = this.sistema.registrarUsuarioFisico("2444555","Chiche Gelblung");
		
		assertEquals(this.sistema.cantidadDeUsuarios(), 5);
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
		
	}
	
	@Test
	void testEliminarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		assertTrue(this.sistema.existeUsuario(emisorPersonaFisca));
		this.sistema.eliminarUsuario(emisorPersonaFisca);
		assertEquals(this.sistema.cantidadDeUsuarios(), 3);
		assertFalse(this.sistema.existeUsuario(emisorPersonaFisca));
	}

}
