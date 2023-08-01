package ar.edu.unlp.info.oo2.ej7_repaso;

import java.time.Duration;
import java.time.LocalDateTime;

public class Paused extends State {

	public Paused(ToDoItem task) {
		super(task);
	}
	@Override
	protected void togglePause() {
		this.task.state = new InProgress(task);
	}
	protected void finish() {
		this.task.state = new Finished(task);
		this.task.finishTime = LocalDateTime.now();
	}
	@Override
	protected Duration workedTime() {
		return Duration.between(this.task.startTime, LocalDateTime.now());
	}

}
