public class TestControlBonus {
    public static void main(String[] args) {
        Funcionario isma = new Gerente();
        isma.setSalario(2000);

        Gerente silvia = new Gerente();
        silvia.setSalario(10000);

        Contador juan = new Contador();
        juan.setSalario(5000);

        ControlBonus cb = new ControlBonus();

        cb.registrar(isma);
        cb.registrar(silvia);
        cb.registrar(juan);
    }   
}
