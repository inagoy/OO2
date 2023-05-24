package ar.edu.unlp.info.oo2.ej4;

public abstract class Topografia {
	public double proporcionAgua;
	
	public double getProporcionTierra() {
		return (1.00 - this.getProporcionAgua());
	}
	
	public abstract boolean esIgualAMixta(Topografia t);
	public abstract double getProporcionAgua();
	public abstract boolean equals(Object otraTopografia);
}
