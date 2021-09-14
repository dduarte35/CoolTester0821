package herencia;

public class Triangulo extends DosDimensiones {
	
	String estilo;
	
	double area() {
		
		return base * altura / 2; //Aqui se accede a las variables establecidas en la clase padre (superclase DosDimensiones)
	}
	
	void mostrarEstilo () {  //metodo no regresa variables solo imprimira en la consulta
		
		System.out.println("Triangulo es: " + estilo);
	}
	
}
