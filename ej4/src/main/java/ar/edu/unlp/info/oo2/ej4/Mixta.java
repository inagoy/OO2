package ar.edu.unlp.info.oo2.ej4;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia {
	
	List<Topografia> hijos;
	
	public Mixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		
		this.hijos = new ArrayList<Topografia>();
		this.hijos.add(t1); this.hijos.add(t2);
		this.hijos.add(t3); this.hijos.add(t4);
	}
	
	public List<Topografia> getHijos(){
		return this.hijos;
	}
	@Override
	public double getProporcionAgua() {
		return (this.hijos.stream().
				mapToDouble(t -> t.getProporcionAgua()).
				sum()) 
				/this.hijos.size() ;
	}
	@Override
	public boolean esIgualAMixta(Topografia otraTopografia) { 
		Mixta m = (Mixta) otraTopografia;
		return this.hijos.equals(m.getHijos());
	}
	@Override
	public boolean equals(Object otraTopografia){
		Topografia t = (Topografia) otraTopografia;
		return t.esIgualAMixta(this);
	}
}
