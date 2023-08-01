package ar.edu.unlp.info.oo2.singleton;

public class prueba {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance("hol");
		System.out.print(s.toString());
	}

}
