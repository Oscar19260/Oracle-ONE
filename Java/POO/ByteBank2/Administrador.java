public class Administrador extends Funcionario implements Autenticlable{
    private AutenticacionUtil util;

    public Administrador(){ this.util = new AutenticacionUtil(); }

    @Override
    public double getBonus() { return this.getSalario(); }

    @Override
    public void setClave(String clave) { this.util.setClave(clave); }

    @Override
    public boolean iniciarSesion(String clave) { return this.util.iniciarSesion(clave); }
}
