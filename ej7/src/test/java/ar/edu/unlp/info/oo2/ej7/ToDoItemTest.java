package ar.edu.unlp.info.oo2.ej7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoItemTest {
	private ToDoItem tareaIniciada;
	private ToDoItem tareaSinIniciar;
	private ToDoItem tareaTerminada;
	private ToDoItem tareaPausada;


	@BeforeEach
	public void setUp() throws Exception {
		this.tareaIniciada = new ToDoItem("tarea1");
		this.tareaSinIniciar = new ToDoItem("tarea2");
		this.tareaTerminada = new ToDoItem("tarea3");
		this.tareaPausada = new ToDoItem("tarea4");
		this.tareaIniciada.start();
		this.tareaTerminada.start();
		this.tareaTerminada.finish();
		this.tareaPausada.start();
		this.tareaPausada.togglePause();
	}

	@Test
	public void testStart() {
		assertTrue(this.tareaIniciada.getState() instanceof InProgress);
		assertTrue(this.tareaSinIniciar.getState() instanceof Pending);
		this.tareaTerminada.start();
		assertTrue(this.tareaTerminada.getState() instanceof Finished);
		this.tareaPausada.start();
		assertTrue(this.tareaPausada.getState() instanceof Paused);
	}
	
	@Test
	public void testTogglePause() {
		this.tareaPausada.togglePause();
		assertTrue(this.tareaPausada.getState() instanceof InProgress);
		this.tareaIniciada.togglePause();
		assertTrue(this.tareaIniciada.getState() instanceof Paused);
	    assertThrows(RuntimeException.class, () -> {this.tareaTerminada.togglePause();});
	    assertThrows(RuntimeException.class, () -> {this.tareaSinIniciar.togglePause();});
	}
	
	@Test
	public void testFinished() {
		assertTrue(this.tareaTerminada.getState() instanceof Finished);
		this.tareaIniciada.finish();
		assertTrue(this.tareaIniciada.getState() instanceof Finished);
		this.tareaSinIniciar.finish();
		assertTrue(this.tareaSinIniciar.getState() instanceof Pending);
		this.tareaPausada.finish();
		assertTrue(this.tareaPausada.getState() instanceof Finished);
		
	}
	
	@Test
	public void testWorkedTime() {
		assertThrows(RuntimeException.class, () -> {this.tareaSinIniciar.workedTime();});
		this.tareaTerminada.setStart(LocalDateTime.of(2023, 3, 31, 15, 32, 0));
		this.tareaTerminada.setEnd(LocalDateTime.of(2023, 3, 31, 16, 32, 30));
		assertEquals(3630,this.tareaTerminada.workedTime().getSeconds());
	}
	
	@Test
	public void testAddComment() {
		this.tareaIniciada.addComment("Hola esto es un comentario");
		this.tareaIniciada.addComment("Hola esto es 2do comentario");
		assertEquals("Hola esto es un comentario",this.tareaIniciada.getCommentaries().get(0));
		assertEquals("Hola esto es 2do comentario",this.tareaIniciada.getCommentaries().get(1));
		
		this.tareaSinIniciar.addComment("Hola esto es un comentario");
		this.tareaSinIniciar.addComment("Hola esto es 2do comentario");
		assertEquals("Hola esto es un comentario",this.tareaSinIniciar.getCommentaries().get(0));
		assertEquals("Hola esto es 2do comentario",this.tareaSinIniciar.getCommentaries().get(1));
		
		this.tareaPausada.addComment("Hola esto es un comentario");
		this.tareaPausada.addComment("Hola esto es 2do comentario");
		assertEquals("Hola esto es un comentario",this.tareaPausada.getCommentaries().get(0));
		assertEquals("Hola esto es 2do comentario",this.tareaPausada.getCommentaries().get(1));
		
		this.tareaTerminada.addComment("Hola esto es un comentario");
		assertEquals(0,this.tareaTerminada.getCommentaries().size());
	}

}