public class TestGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setSalario(6000);

        g1.setClave("AluraCursosOnline");

        System.out.println(g1.getBonus());
        System.out.println(g1.iniciarSesion("AluraCursosOnline"));
    }
}
