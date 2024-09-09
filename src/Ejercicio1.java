import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner edadScanner = new Scanner(System.in);
        System.out.println("ingresa tu edad");

        Integer edad = edadScanner.nextInt();

        if (edad <= 2 && edad == 0){
            System.out.println("tu edad es " + edad + " eres un bebé");
        }
        if (edad > 2 && edad <= 8 ) {
            System.out.println("tu edad es " + edad + " eres un niño");
        }
        if (edad > 9 && edad <= 13) {
            System.out.println("tu edad es " + edad + " eres un preadolecente");
        }
        if (edad >= 18 && edad < 60){
            System.out.println("tu edad es " + edad + " eres adulto");
        }
        if (edad >= 60){
            System.out.println("tu edad es " + edad + " eres adultomayor");
        } else if (edad <= 0)  {
            System.out.println("tu edad es " + edad + " eres un bebé de menos de un año o no has nacido");
        }
    }
}
