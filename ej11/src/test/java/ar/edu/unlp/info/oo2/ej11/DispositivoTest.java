package ar.edu.unlp.info.oo2.ej11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DispositivoTest {
	
	private Dispositivo dispositivo;
	
	@BeforeEach
	void setUp () throws Exception{
		dispositivo = new Dispositivo();
	}
	
	@Test
	void testSend() {
		Dispositivo dispositivo4g16 = new Dispositivo();
		dispositivo4g16.connectTo(new Adapter4G());
		
		Dispositivo dispositivo4g32 = new Dispositivo();
		dispositivo4g32.connectTo(new Adapter4G());
		dispositivo4g32.setCalculator(new CRC32_Calculator());
		
		Dispositivo dispositivoWifi32 = new Dispositivo();
		dispositivoWifi32.setCalculator(new CRC32_Calculator());
		
		assertEquals("Hola 59909",dispositivo.send("Hola")); //CRC 16, WIFI
		assertEquals("Hola 59909",dispositivo4g16.send("Hola")); //CRC 16, 4G
		
		assertEquals("Hola -812493130",dispositivo4g32.send("Hola")); //CRC 32, 4G
		assertEquals("Hola -812493130",dispositivoWifi32.send("Hola")); //CRC 32, WIFI
	}
	
	@Test
	void testConectarCon() {
		assertEquals("Muestra en pantalla el símbolo: Conección 4G.", dispositivo.connectTo(new Adapter4G()));
		assertEquals("Muestra en pantalla el símbolo: Conección Wifi.", dispositivo.connectTo(new WifiConn()));
		

	}
	
	@Test
	void testConfigurarCRC() {
		dispositivo.setCalculator(new CRC16_Calculator());
		assertTrue(dispositivo.getCalculator() instanceof CRC16_Calculator);
		
		dispositivo.setCalculator(new CRC32_Calculator());
		assertTrue(dispositivo.getCalculator() instanceof CRC32_Calculator);
	}

}
