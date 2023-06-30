public class TestReferencia {
    public static void main(String[] args) {
        Cuenta1 primeraCuenta = new Cuenta1(1);
        primeraCuenta.depositar(300);

        System.out.println("saldo de primera cuenta : " + primeraCuenta.getSaldo());

        Cuenta1 segundaCuenta = primeraCuenta;

        System.out.println("saldo de segunda Cuenta: " + segundaCuenta.getSaldo());

        segundaCuenta.depositar(100);
        System.out.println("saldo de segunda Cuenta " + segundaCuenta.getSaldo());

        System.out.println(primeraCuenta.getSaldo());

        if(primeraCuenta == segundaCuenta) {
            System.out.println("Es la misma cuenta");
        }

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
    }    
}
