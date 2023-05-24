package ar.edu.unlp.info.oo2.ej14;

import java.time.LocalDate;

public interface FileOO2 {
	String prettyPrint();
	String getName();
	String getExtension();
	double getSize();
	LocalDate getCreatedDate();
	LocalDate getModifiedDate();
	String getPermissions(); 
}
