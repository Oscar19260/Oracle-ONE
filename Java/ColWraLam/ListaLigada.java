import java.util.LinkedList;
import java.util.List;

public class ListaLigada{
    public static void main(String[] args) {
        List<Integer> listaNumeros = new LinkedList<Integer>();  
        int n1 = 43;
        int n2 = 42;
        int n3 = 69;

        Integer numObj = Integer.valueOf(50);

        listaNumeros.add(n1);
        listaNumeros.add(n2);
        listaNumeros.add(n3);
        listaNumeros.add(numObj);

        int valorPrimitivo = numObj.intValue();
        System.out.println(valorPrimitivo);
    }
}