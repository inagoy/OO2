package ar.edu.unlp.info.oo2.ej4;

public abstract class Simple extends Topografia {
	
	@Override
	public boolean esIgualAMixta(Topografia t) {
		return false;
	}
	@Override
	public boolean equals(Object otraTopografia){
		   Topografia t = (Topografia) otraTopografia;
		   return (this.getProporcionAgua() == t.getProporcionAgua());
	}
}
