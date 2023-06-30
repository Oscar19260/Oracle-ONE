public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Contador();
        f1.setNombre("Aaron");
        f1.setDocumento("FR3S4DUD3");
        f1.setSalario(2000);

        System.out.println(f1.getSalario());
        System.out.println(f1.getBonus());
    }
}
