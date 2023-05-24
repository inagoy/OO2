package ar.edu.unlp.info.oo2.ej14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOO2Test {
	
	FileOO2 file;
	FileOO2 name;
	FileOO2 permissions;
	FileOO2 size;
	
	@BeforeEach
	void setUp() throws Exception {
		file = new File("pepe", ".jpg", "rwxr-xr-x", 4.13);
	}
    @Test
    
    public void testPrettyPrint() {
    	
    	// name - permissions -size
    	
    	name = new NameDecorator(file);
    	permissions = new PermissionsDecorator(name);
    	size = new SizeDecorator(permissions);
        assertEquals("Datos: \n pepe rwxr-xr-x 4.13 MB", size.prettyPrint());
        
    }
}
