package ar.edu.unlp.info.oo2.ej21;

import java.time.LocalDate;

public class NullMamifero implements Mamifero {

	@Override
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return false;
	}

	@Override
	public void setIdentificador(String id) {
	
	}

	@Override
	public void setEspecie(String especie) {

	}

	@Override
	public void setFechaNacimiento(LocalDate fecha) {
	}

	@Override
	public void setMadre(Mamifero madre) {

	}

	@Override
	public void setPadre(Mamifero padre) {

	}

	@Override
	public String getIdentificador() {
		return null;
	}

	@Override
	public String getEspecie() {
		return null;
	}

	@Override
	public LocalDate getFechaNacimiento() {
		return null;
	}

	@Override
	public Mamifero getMadre() {
		return null;
	}

	@Override
	public Mamifero getPadre() {
		return null;
	}

	@Override
	public Mamifero getAbuelaMaterna() {
		return null;
	}

	@Override
	public Mamifero getAbueloMaterno() {
		return null;
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		return null;
	}

	@Override
	public Mamifero getAbueloPaterno() {
		return null;
	}

}
