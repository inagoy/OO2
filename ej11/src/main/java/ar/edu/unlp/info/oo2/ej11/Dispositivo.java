package ar.edu.unlp.info.oo2.ej11;

public class Dispositivo {
	private Calculator crcCalculator;
	private Connection connection;
	private Ringer ringer;
	private Display display;
	
	public Dispositivo() {
		this.crcCalculator = new CRC16_Calculator();
		this.connection = new WifiConn();
		this.ringer = new Ringer();
		this.display = new Display();
	}
	
	public String send(String data) {
		int crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public String connectTo(Connection connection) {
		this.connection = connection;
		this.ringer.ring();
		return this.display.showBanner(connection.pict());
	}
	
	
	public void setCalculator(Calculator crcCalculator) {
		this.crcCalculator = crcCalculator;
	}


	public Display getDisplay() {
		return display;
	}

	public Calculator getCalculator() {
		return this.crcCalculator;
	}
}
