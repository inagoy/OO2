package ar.edu.unlp.info.oo2.facturacion_llamadas_refactory;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Persoonal {
	public SortedSet<String> guiaTelefonica = new TreeSet<String>();
	private List<Persoona> usuarios;
	public Persoonal() {
		this.usuarios = new ArrayList<>();
	}
	public Persoona registrarUsuario (Persoona unaPersoona){
		
		if (guiaTelefonica.size() > 0) {
			String numeroDisponible = guiaTelefonica.last();
			guiaTelefonica.remove(numeroDisponible);
			unaPersoona.setTelefono(numeroDisponible);
			this.usuarios.add(unaPersoona);
			return unaPersoona;
		}
		return null;
	}
	
	public boolean eliminarUsuario(Persoona unaPersoona) {
		this.agregarTelefono(unaPersoona.getTelefono());
		return this.usuarios.remove(unaPersoona);
		
	}
	
	public boolean agregarTelefono(String telefono) {
		return guiaTelefonica.add(telefono);
	}

	public int cantidadDeUsuarios() {
		return usuarios.size();
	}
	
	public boolean existeUsuario(Persoona persona) {
		return usuarios.contains(persona);
	}	
	
}
