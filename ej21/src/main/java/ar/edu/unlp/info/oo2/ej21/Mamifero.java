package ar.edu.unlp.info.oo2.ej21;
import java.time.LocalDate;

public interface Mamifero {
	boolean tieneComoAncestroA(Mamifero unMamifero);
	//Setters
	void setIdentificador(String id);
	void setEspecie(String especie);
	void setFechaNacimiento(LocalDate fecha);
	void setMadre(Mamifero madre);
	void setPadre(Mamifero padre);
	
	//Getters
	String getIdentificador();
	String getEspecie();
	LocalDate getFechaNacimiento();
	Mamifero getMadre();
	Mamifero getPadre();

	Mamifero getAbuelaMaterna();
		
	Mamifero getAbueloMaterno();
	
	Mamifero getAbuelaPaterna();
	
	Mamifero getAbueloPaterno();
}
