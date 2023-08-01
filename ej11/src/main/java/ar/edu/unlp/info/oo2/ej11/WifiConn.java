package ar.edu.unlp.info.oo2.ej11;

public class WifiConn implements Connection {
	String pict;
	
	public WifiConn() {
		this.pict = "Conección Wifi.";
	}
	
	@Override
	public String sendData(String data, int crc) {
		return data + " " + crc;
	}

	@Override
	public String pict() {
		return this.pict;
	}

}
