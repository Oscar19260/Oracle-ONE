public class Wrappers {
    public static void main(String[] args) {
        // Double numeroDouble = 33.0;
        // Boolean verdadero = true;

        Double numeroDouble2 = Double.valueOf(33);
        System.out.println(numeroDouble2);

        String numeroString = "43";

        Double string2double = Double.valueOf(numeroString);
        Integer string2integer = Integer.valueOf(numeroString);

        System.out.println(string2double);
        System.out.println(string2integer);
    }
}
