

public class variablesboolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = 18;
		int cantidadDePersonas=2;
		
		boolean esPareja=cantidadDePersonas>1;
		boolean puedeEntrar=edad>=18&&esPareja;
		System.out.println("El valor de la condicion es: "+esPareja);
		
		if (puedeEntrar) {
			System.out.println("Adelante, podes pasar.");
		} else {
			System.out.println("Lo siento, no podes pasar.");
		}
	}

}
