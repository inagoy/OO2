package ar.edu.unlp.info.oo2.ej7_repaso;


import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	protected List<String> comentaries;
	protected State state;
	protected LocalDateTime startTime;
	protected LocalDateTime finishTime;
	
	public ToDoItem(String name) {
		this.name=name;
		this.comentaries = new ArrayList<>();
		this.state = new Pending(this);
	}
	
	public void start() {
		this.state.start();
	}
	
	public void togglePause() {
		this.state.togglePause();
	}
	
	public void finish() {
		this.state.finish();
	}
	
	public Duration workedTime() {
		return this.state.workedTime();
	}
	
	public void addComment(String comment) {
		this.state.addComment(comment);
	}

	public String getName() {
		return name;
	}
}

