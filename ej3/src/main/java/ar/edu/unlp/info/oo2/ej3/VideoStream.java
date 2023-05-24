package ar.edu.unlp.info.oo2.ej3;

public class VideoStream {
	private int tiempo;
	private String video;
	
	public VideoStream(String video, int tiempo) {
		this.tiempo=tiempo;
		this.video=video;
	}
	
	public String reproduce() {
		return (this.video + " " + this.tiempo);
	}
}
