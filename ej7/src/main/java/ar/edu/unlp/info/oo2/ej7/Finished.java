package ar.edu.unlp.info.oo2.ej7;

import java.time.LocalDateTime;

public class Finished extends State {

	public Finished(ToDoItem task) {
		super(task);
		this.getTask().setEnd(LocalDateTime.now());
	}


	@Override
	public void togglePause() {
		throw new RuntimeException("ERROR: you can't pause or resume in Finished");

	}
	
	@Override
	public void addComment(String comment) {
		
	}
}
