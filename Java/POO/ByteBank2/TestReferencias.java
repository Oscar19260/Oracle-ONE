public class TestReferencias {
    public static void main(String[] args) { 
        // Elemento mas genérico puede ser adaptado al más específico
        
        Funcionario func = new Gerente();
        func.setNombre("Mike");

        Gerente gerente = new Gerente();
        gerente.setNombre("Silvia");

        func.setSalario(2000);
        gerente.setSalario(10000);

        gerente.iniciarSesion(":)");
    
        /* ----------------------------------------------------------
        Gerente g1 = new Gerente();
        g1.setNombre("Marcos");
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControlBonus controle = new ControlBonus();
        controle.registrar(g1);
        controle.registrar(ev);
        controle.registrar(d);

        System.out.println(controle.getSuma());
        ---------------------------------------------------------- */
    }
}
