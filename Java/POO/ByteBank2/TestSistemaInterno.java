public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno si = new SistemaInterno();
        Gerente g1 = new Gerente();
        Administrador admin = new Administrador();

        si.autentica(g1);
        si.autentica(admin);
    }
}
