package ar.edu.unlp.info.oo2.ej7;

import java.time.LocalDateTime;

public class InProgress extends State {

	public InProgress(ToDoItem task) {
		super(task);
		this.getTask().setStart(LocalDateTime.now());
	}

	@Override
	public void togglePause() {
		this.getTask().setState(new Paused(this.getTask()));
	}
	@Override
	public void finish() {
		this.getTask().setState(new Finished(this.getTask()));
	}

	

}
