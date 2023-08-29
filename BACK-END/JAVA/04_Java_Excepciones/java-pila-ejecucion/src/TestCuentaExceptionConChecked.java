
public class TestCuentaExceptionConChecked {
	public static void main(String[] args) {
		Cuenta cuenta=new Cuenta();
		try {
			cuenta.deposita();
		} catch (Miexcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
