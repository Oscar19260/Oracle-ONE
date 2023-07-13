// package Java.Excepciones.pila-ejecucion;

public class flujo {
    public static void main(String[] args) {
        System.out.println("Inicio main");
        try {
            metodo1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Fin main");
    }

    private static void metodo1() throws MyException{
        System.out.println("Inicio metodo 1");
        metodo2(); 
        System.out.println("Fin metodo 1");
    }

    private static void metodo2() throws MyException{
        System.out.println("Inicio metodo 2");
        /* ------------------------------------------------------------------------------
        for (int i = 1; i <= 5; i++){ 
            System.out.println(i);
            // Intenta
            try{
                if (i == 3){
                    int num = 0;
                    int resultado = i/num;
                    System.out.println(resultado); 
                }
                // String test = null;
                // System.out.println(test.toString());
            } 
            // Atrapa el error
            catch(ArithmeticException | NullPointerException exception){
                System.out.println("Atrapo Excepcion!!!");
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }   
        }
        ------------------------------------------------------------------------------ */
        throw new MyException("Mi excepcion fue lanzada");
        // System.out.println("Fin metodo 2");
    }
}
