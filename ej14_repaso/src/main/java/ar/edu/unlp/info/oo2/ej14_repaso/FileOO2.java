package ar.edu.unlp.info.oo2.ej14_repaso;

import java.time.LocalDateTime;

public interface FileOO2 {
	String prittyPrint();
	String getNombre();
	String getExtension();
	String getPermisos();
	LocalDateTime getFechaCreacion();
	LocalDateTime getFechaModificacion();
	double getTamaño();
}
