
public class flujo {

	public static void main(String[] args) {
		System.out.println("Inicio de main");
		metodo1();
		System.out.println("Fin de main");
	}

	public static void metodo1() {
		System.out.println("Inicio do metodo1");
		try {
			metodo2();
			
		} catch (Miexcepcion e) {
			e.printStackTrace();
		}
		System.out.println("Fin de metodo1");
	}

	public static void metodo2()  throws Miexcepcion{
		System.out.println("Inicio de metodo2");
		throw new Miexcepcion("Mi exception fue lanzadaaaaaaa");
		
		
	}

}
