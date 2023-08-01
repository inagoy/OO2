package ar.edu.unlp.info.oo2.ej11;

public class Connection4G {
	private String symb;
	
	public Connection4G() {
		this.symb = "Conección 4G.";
	}
	public String transmit(String data, int crc) {
		return data + " " +crc;
	}

	public String symb() {
		return this.symb;
	}

}
