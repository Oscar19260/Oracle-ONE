public class Gerente extends Funcionario implements Autenticlable {
    // Sobreescritura de un metodo
    public double getBonus(){ return 2000; }

    @Override
    public void setClave(String clave) {  }

    @Override
    public boolean iniciarSesion(String clave) { return false; }
}
