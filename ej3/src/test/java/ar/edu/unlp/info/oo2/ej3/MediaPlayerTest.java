package ar.edu.unlp.info.oo2.ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MediaPlayerTest {
	private MediaPlayer mediaPlayer;

	@BeforeEach
	void setUp() throws Exception {
		mediaPlayer = new MediaPlayer();
		mediaPlayer.addMedia(new Audio("Arctic Monkeys", "Arabella.wav"));
		mediaPlayer.addMedia(new Video("Tarantino", "Habia una vez..."));
		mediaPlayer.addMedia(new VideoStreamAdapter(new VideoStream("Stream Coscu", 15)));
	}
	
	@Test
	public void addMediaTest() {
		assertEquals(3, mediaPlayer.getMedias().size());
		
	}
	@Test
	public void playMedia() {
		System.out.print(mediaPlayer.playMedia());
		assertNotNull(mediaPlayer.playMedia());
	}
		
}
