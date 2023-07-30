public class Arrays{
    public static void main(String[] args) {
        // Pasamos parametros desde la linea de ejecucion
        /*
        for (int i=0; i < args.length; i++){
            System.out.println(args[i]);
        }
        */

        int[] edades = new int[5];
        edades[2] = 30;

        System.out.println(edades[2]);
        System.out.println(edades[0]);

        int tamanoArray = edades.length;
        System.out.println(tamanoArray);

        for (int i=0; i < tamanoArray; i++){
            System.out.println(edades[i]);
        }
    }
}