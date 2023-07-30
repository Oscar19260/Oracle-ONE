import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

public class Lambdas {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Super Mario");
        nombres.add("Yoshi");
        nombres.add("Donkey Kong"); 
        
        // Implementation I
        // Collections.sort(nombres, new Comparator<String>() {
        //     @Override
        //     public int compare(String s1, String s2) {
        //         return s1.length() - s2.length();
        //     }
        // });

        // for(int i = 0; i < nombres.size(); i++) {
        //     System.out.println(nombres.get(i));
        // }

        // Implementation II
        //Collections.sort(nombres, (s1, s2) ->  s1.length() - s2.length());
        
        nombres.forEach((nombre) -> System.out.println(nombre));

        // Implementation III
        nombres.sort((s1, s2) ->  s1.length() - s2.length());

        System.out.println(nombres);   
    }
}
