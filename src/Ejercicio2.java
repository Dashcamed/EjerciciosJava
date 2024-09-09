import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {

        List<Integer> numeros1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> numeros2 = Arrays.asList(9,8,7,6,5,4,3,2,1);

        System.out.println("el primer elemento es " + numeros1.get(0));
        System.out.println("el ultimo elemento es " + numeros2.get(8));

        numeros1.forEach(x -> System.out.println("numero: " + x));
        System.out.println("*************************");
        numeros2.forEach(x -> System.out.println("numero: " + x));

    }
}
