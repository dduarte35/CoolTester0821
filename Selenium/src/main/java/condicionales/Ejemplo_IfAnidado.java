package condicionales;

public class Ejemplo_IfAnidado {

	public static void main(String[] args) {

		int temperatura = 16;
		
		if (temperatura > 15) {
			if(temperatura > 25) {
			System.out.println("A la Playa!!!");
		} else {
			System.out.println("A la monta�a");
		}
		} else {
			System.out.println("A descansar...");
		}
	}

}
