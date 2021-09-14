package clases_objetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		
		Vehiculo minivan = new Vehiculo();
		int rango;
		
		//Asignando valores a las variables de minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 5;
		minivan.kmh = 20;
		
		//Calculo de Rango asumiento un tanque lleno
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("La minivan puede llevar " +minivan.pasajeros + " pasajeros con rango de " + rango + " kilometros");
		
		Vehiculo carro = new Vehiculo ();
		carro.pasajeros = 4;
		
		System.out.println("Numeros en pasajeros en carro es: " + carro.pasajeros);
		
	}

}
