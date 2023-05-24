package ar.edu.unlp.info.oo2.ej3;

public class VideoStreamAdapter implements Media{
	private VideoStream adaptee;
	public VideoStreamAdapter(VideoStream stream) {
		this.adaptee=stream;
	}
	@Override
	public String play() {
		return adaptee.reproduce();
	}
}
