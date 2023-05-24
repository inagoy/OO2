package ar.edu.unlp.info.oo2.ej7;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends State {
	
	public Pending (ToDoItem task) {
		super(task);
	}

	@Override
	public void start() {
		this.getTask().setState(new InProgress(this.getTask()));
		
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("ERROR: can't pause or resume in Pending");

	}

	
	@Override
	public Duration workedTime() {
		throw new RuntimeException("ERROR:not started");
	}

}
