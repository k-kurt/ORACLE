
public class flujo {
	


		  public static void main(String[] args) {
		    System.out.println("Inicio de main");
		    metodo1();
		    System.out.println("Fin de main");
		  }
		  public static void metodo1(){
		    System.out.println("Inicio do metodo1");
		    metodo2();
		    System.out.println("Fin de metodo1");
		  }
		  public static void metodo2(){
		    System.out.println("Inicio de metodo2");
		    for(int i =1; i<= 5; i++){
		      System.out.println(i);
		    try {
		    	int num=0;
			      int resultado=i/num;
			      System.out.println(resultado);
			      
			} catch (ArithmeticException | NullPointerException exception ) {
				System.out.println("Atrapo excepcion");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
				
			}  
		    }
		    System.out.println("Fin de metodo2");
		  }
		  
		  
		}

