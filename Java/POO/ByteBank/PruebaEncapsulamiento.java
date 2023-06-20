public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(2);
        Cliente cliente = new Cliente();

        cliente.setNombre("Isma");
        cliente.setClave("GAGI12345");

        cuenta.setTitular(cliente);

        Cliente titular = cuenta.getTitular();

        System.out.println(cliente);
        System.out.println(cuenta.getTitular());
        System.out.println(titular);
    }
}
