package ar.edu.unlp.info.oo2.ej7;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class State {
	private ToDoItem task;
	
	public State (ToDoItem task) {
		this.task = task;
	}
	
	public void start() {
	};
	
	public abstract void togglePause();
	
	public void finish() {
	};
	
	public Duration workedTime() {
		return Duration.between(this.task.getStart(), this.task.getEnd());
	}
	
	public void addComment(String comment) {
		this.task.getCommentaries().add(comment);
	}
	
	public ToDoItem getTask() {
		return this.task;
	}
}
