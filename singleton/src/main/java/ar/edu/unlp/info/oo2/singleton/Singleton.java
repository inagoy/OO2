package ar.edu.unlp.info.oo2.singleton;

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
    
    @Override
    public String toString() {
    	return "Hola soy el Singleton con el valor: " + this.value + "  " + super.hashCode();
    }
}
