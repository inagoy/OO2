package ar.edu.unlp.info.oo2.ej7;

import java.time.LocalDateTime;

public class Paused extends State {

	public Paused(ToDoItem task) {
		super(task);
	}

	@Override
	public void togglePause() {
		this.getTask().setState(new InProgress(this.getTask()));
	}
	@Override
	public void finish() {
		this.getTask().setState(new Finished(this.getTask()));
	}
	

}
