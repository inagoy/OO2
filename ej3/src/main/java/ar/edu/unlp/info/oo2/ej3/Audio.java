package ar.edu.unlp.info.oo2.ej3;

public class Audio implements Media{
	private String artista;
	private String track;
	
	public Audio(String artista, String track) {
		this.artista=artista;
		this.track=track;
	}
	@Override
	public String play() {
		return (this.artista + " " + this.track);
	}
}
