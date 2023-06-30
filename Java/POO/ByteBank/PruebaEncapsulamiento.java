public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta1 cuenta = new Cuenta1(2);
        Cliente1 cliente = new Cliente1();

        cliente.setNombre("Isma");
        cliente.setClave("GAGI12345");

        cuenta.setTitular(cliente);

        Cliente1 titular = cuenta.getTitular();

        System.out.println(cliente);
        System.out.println(cuenta.getTitular());
        System.out.println(titular);
    }
}
