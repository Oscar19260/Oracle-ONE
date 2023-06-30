// package Java.Examples.enums;

public class principal {
    public static void main(String[] args) {
        for(Dia d : Dia.values()){
            System.out.println("El dia de la semana es: " + d);
        }

        Dia domingo = Dia.DOMINGO;
        // Nombre del atributo
        System.out.println(domingo.name());
        // Numero dentro del enum
        System.out.println(domingo.ordinal());
        // enum -> string
        System.out.println(domingo.toString());
    }
}
