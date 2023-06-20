public class TestMetodos {
    public static void main (String[] args) {
        Cuenta cuentaDeDiego = new Cuenta(1);
        cuentaDeDiego.depositar(100);
        cuentaDeDiego.depositar(50);
        System.out.println(cuentaDeDiego.getSaldo());

        boolean consigioRetirar = cuentaDeDiego.retirar(20);
        System.out.println(cuentaDeDiego.getSaldo());
        System.out.println(consigioRetirar);

        Cuenta cuentaDeJimena = new Cuenta(1);
        cuentaDeJimena.depositar(1000);

        boolean exitoTransferencia = cuentaDeJimena.transferir(300, cuentaDeDiego);
        if(exitoTransferencia) {
            System.out.println("transferencia exitosa");
        } else {
            System.out.println("falto dinero");
        }
    }
}
