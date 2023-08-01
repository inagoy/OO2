package ar.edu.unlp.info.oo2.ej21;

import java.time.LocalDate;

public class RealMamifero implements Mamifero{

	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public RealMamifero(String id) {
		identificador=id;
		//aca inicializar padre y madre en null?
		madre = new NullMamifero();
		padre = new NullMamifero();
	}
	@Override
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return padre.equals(unMamifero) || madre.equals(unMamifero) 
				|| padre.tieneComoAncestroA(unMamifero) || madre.tieneComoAncestroA(unMamifero);
	}

	@Override
	public void setIdentificador(String id) {
		this.identificador = id;
	}

	@Override
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public void setFechaNacimiento(LocalDate fecha) {
		this.fechaNacimiento = fecha;
	}

	@Override
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	@Override
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	@Override
	public String getIdentificador() {
		return this.identificador;
	}

	@Override
	public String getEspecie() {
		return this.especie;
	}

	@Override
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	@Override
	public Mamifero getMadre() {
		return this.madre;
	}

	@Override
	public Mamifero getPadre() {
		return this.padre;
	}

	@Override
	public Mamifero getAbuelaMaterna() {
		return this.madre.getMadre();
	}

	@Override
	public Mamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}

	@Override
	public Mamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}

	@Override
	public Mamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}

}
