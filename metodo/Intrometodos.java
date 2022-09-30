package metodo;
import java.util.Scanner;
public class Intrometodos {

	public static void main(String[] args) {
		calcularRaicesCuadraticas();
	}//cierre del main

	//modificador de acceso+ tipo de dato que va a devolver el metodo
	//definicion de metodo
	private static void calcularRaicesCuadraticas() {
		//el cuerpo del metodo
		Scanner lector = new Scanner(System.in);
		
	  System.out.println("a= ");
	  double a = lector.nextDouble();
	  System.out.println("b= ");
	  double b = lector.nextDouble();
	  System.out.println("c= ");
	  double c = lector.nextDouble();
	  
	  double discriminante = Math.pow(b, 2) - 4 * b * c;
	  
	  double x1 = (-a + Math.sqrt(discriminante))/(2*a);
	  double x2 = (-b - Math.sqrt(discriminante))/(2*a);
	  
	  

	  System.out.println("x1 = " + x1);
	  System.out.println("x2 = " + x2);
	    
	
		
		
	}
	
	
}//cierre de la clase 
