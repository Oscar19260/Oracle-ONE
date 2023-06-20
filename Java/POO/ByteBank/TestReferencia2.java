public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente();
        cl1.setNombre("Juan");
        cl1.setClave("69696900");
        cl1.setTelefono("448234123");

        Cuenta c1 = new Cuenta(1);
        c1.setTitular(cl1);

        System.out.println(c1.getTitular().getClave());
        System.out.println(c1.getTitular());
        System.out.println(cl1);
    }    
}
