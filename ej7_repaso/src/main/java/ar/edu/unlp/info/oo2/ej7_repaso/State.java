package ar.edu.unlp.info.oo2.ej7_repaso;

import java.time.Duration;

public abstract class State {
	protected ToDoItem task;

	public State(ToDoItem task) {
		this.task = task;
	}
	
	protected void start() {	
	};
	
	protected void finish() {
		
	}
	protected abstract void togglePause();

	protected void addComment(String comment) {
		this.task.comentaries.add(comment);
	}

	protected abstract Duration workedTime();
}
