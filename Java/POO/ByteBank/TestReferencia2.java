public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente1 cl1 = new Cliente1();
        cl1.setNombre("Juan");
        cl1.setClave("69696900");
        cl1.setTelefono("448234123");

        Cuenta1 c1 = new Cuenta1(1);
        c1.setTitular(cl1);

        System.out.println(c1.getTitular().getClave());
        System.out.println(c1.getTitular());
        System.out.println(cl1);
    }    
}
