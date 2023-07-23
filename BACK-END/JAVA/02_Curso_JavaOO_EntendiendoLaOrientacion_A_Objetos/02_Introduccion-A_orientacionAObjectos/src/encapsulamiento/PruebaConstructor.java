package encapsulamiento;

import data.Cuenta;

public class PruebaConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			Cuenta cuenta=new Cuenta(222);
			Cuenta cuenta2=new Cuenta(333);
			System.out.println(Cuenta.getTotal());

	}

}
