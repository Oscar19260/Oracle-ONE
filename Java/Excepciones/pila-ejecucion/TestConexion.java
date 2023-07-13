public class TestConexion{
    public static void main(String[] args) throws Exception{
        // Try with resources 
        try (Conexion con = new Conexion()){
            con.leerDatos();
        } 
        catch (IllegalStateException ex){
            System.out.println("Ejecutando catch");
            ex.printStackTrace();
        }

        /*
        Conexion con = null;
        try{
            con = new Conexion();
            con.leerDatos();
        } 
        catch (IllegalStateException e){
            // System.out.println("Recibiendo exception");
            e.printStackTrace();
        } 
        finally {
            System.out.println("Ejecutando finally");
            if (con != null){ 
                con.cerrar(); 
            }
        }
        */
    }
}