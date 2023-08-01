package ar.edu.unlp.info.oo2.ej7_repaso;

import java.time.Duration;

public class Finished extends State {

	protected Finished(ToDoItem task) {
		super(task);
	}

	@Override
	protected void togglePause() {
		throw new RuntimeException("No se puede pausar una tarea finalizada.");
	}

	@Override
	protected void addComment(String comment) {
		
	}

	@Override
	protected Duration workedTime() {
		return Duration.between(this.task.startTime, this.task.finishTime);
	}

}
