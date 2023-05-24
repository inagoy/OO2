package ar.edu.unlp.info.oo2.ej3;

public class Video implements Media{
	private String director;
	private String video;
	
	public Video(String director, String video) {
		this.director=director;
		this.video=video;
	}
	@Override
	public String play() {
		return (this.director + " " + this.video);
	}
}