import java.util.ArrayList;

public class ArraysList{
    public static void main(String[] args) {
        // <> Forzando a que acepte un solo tipo de objeto
        ArrayList<String> lista = new ArrayList<>();

        String c1 = "Cuenta 1";
        String c2 = "Cuenta 2";
        String c3 = "Cuenta 1";

        lista.add(c1);
        lista.add(c2);

        for (String s : lista){
            System.out.println(s);
        }

        boolean contains = lista.contains(c3);
        if(contains) { System.out.println("Cy"); }
    }
}