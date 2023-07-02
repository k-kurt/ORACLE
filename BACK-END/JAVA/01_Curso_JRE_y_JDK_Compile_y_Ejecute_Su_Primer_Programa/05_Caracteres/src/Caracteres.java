
public class Caracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char caracter='a';
		System.out.println(caracter);
		
		//no acepta caracter vacio ni 2 letras
		
		caracter=65;
		System.out.println(caracter);
		//un numero representa el valor en la tabla ASCII
		
		caracter=65+1;
		System.out.println(caracter);
		//suma el numero y hace referenica a la tabla ASCII
		
		//char segundoCaracter=caracter+1; 
		//esto ya no compila por que esta sumando un tipo int con un tipo char de antes
		
		char segundoCaracter=(char)(caracter+1); 
		System.out.println(segundoCaracter);
		//este si ya compila hice cast e hice la suma entre parentesis
		
		
		
		
	}

}
