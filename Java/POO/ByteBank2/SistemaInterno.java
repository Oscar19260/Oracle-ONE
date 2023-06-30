public class SistemaInterno {
    private String clave = "AluraCursosOnline";

    public boolean autentica(Autenticlable gerente){
        boolean bandIniciarSesion = gerente.iniciarSesion(clave);
        if(bandIniciarSesion){
            System.out.println("Login existoso!");
            return true;
        }
        else{
            System.out.println("Error en login");
            return false;
        }
    }
}
