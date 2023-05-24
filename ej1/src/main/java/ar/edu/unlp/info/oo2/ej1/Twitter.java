package ar.edu.unlp.info.oo2.ej1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {

	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario crearUsuario(String screenName) {
		Usuario u = null;
		if (!existeUsuario(screenName)) {
			u = new Usuario(screenName);
			usuarios.add(u);
		} 
		return u;
	}
	
	private boolean existeUsuario(String screenName) {
		return this.usuarios
			.stream()
			.anyMatch(u -> u.getScreenName().equals(screenName));
	}
	
	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}
}
