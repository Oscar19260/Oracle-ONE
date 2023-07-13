public class TestCuentaExceptionChecked {
    public static void main(String[] args) {
		CuentaE cuenta = new CuentaE();
		try {
			cuenta.deposita();
		} catch (MiException e) {
			e.printStackTrace();
		}
	}
}
