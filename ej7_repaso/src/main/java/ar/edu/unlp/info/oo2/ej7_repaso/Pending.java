package ar.edu.unlp.info.oo2.ej7_repaso;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends State {
	
	public Pending(ToDoItem task) {
		super(task);	
	}

	@Override
	protected void start() {
		task.state = new InProgress(task);
		task.startTime = LocalDateTime.now();
	}

	@Override
	protected void togglePause() {
		throw new RuntimeException("No se puede finalizar una tarea no iniciada.");
	}

	@Override
	protected Duration workedTime() {
		throw new RuntimeException("No se puede calcular la duración de una tarea no iniciada.");
	}

}
