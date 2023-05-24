package ar.edu.unlp.info.oo2.ej3;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

	private List<Media> medias;
	
	public MediaPlayer() {
		this.medias = new ArrayList<>();
	}
	
	public String playMedia() {
		StringBuffer output = new StringBuffer(110);
		this.medias.stream()
		.forEach(m -> output.append(m.play()));
		return output.toString();
	}
	
	public void addMedia(Media media) {
		this.medias.add(media);
	}
	
	public List<Media> getMedias() {
		return this.medias;
	}
}
