package arreglo;

public class Ejemplo_Arreglo2Dimensiones {

	public static void main(String[] args) {
		
		//Ejemplo arreglo una dimensi�n
		//int [] intArray = new int [] {1,2,3,4,5};
		
		//declarando e inicializando arreglo 2D
		int arr[][] = {{2,7,9},{3,6,1},{7,4,2}};
		
		//System.out.println(arr[1][2]);
		
		for (int i = 0; i < 3; i++) {
			for ( int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " "); //print en la misma l�nea
			}
			System.out.println(); //Salto de l�nea
		}

	}

}
