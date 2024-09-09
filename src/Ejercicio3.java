import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // se pregunta al usuario cuantos elementos tendran los dos arreglos
        System.out.println("¿Cuántos elementos tedrá tu array?");
        int cantidadElementos = scanner.nextInt();

        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        // se usa un bucle for para añadir los elementos a las listas
        System.out.println("Introduce los elementos de la lista 1:");
        for (int i = 0; i < cantidadElementos; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            int elemento = scanner.nextInt();
            lista1.add(elemento);
        }
        System.out.println("Introduce los elementos de la lista 2:");
        for (int i = 0; i < cantidadElementos; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            int elemento = scanner.nextInt();
            lista2.add(elemento);
        }

        // se imprimen las listas
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);

        // se imprime la sumatoria de todos los elementos de las listas
        int sumaLista1 = lista1.stream().reduce(0,(acc,e)-> acc + e);
        System.out.println("El total de la lista 1 es: " + sumaLista1);

        int sumaLista2 = lista2.stream().reduce(0,(acc,e)-> acc + e);
        System.out.println("El total de la lista 2 es: " + sumaLista2);

        // se buscan los elementos maximos y minimos en ambas listas
        int mayorDeLaLista1 = lista1.stream().max((v1, v2) -> v1 - v2).get();
        int mayorDeLaLista2 = lista2.stream().max((v1, v2) -> v1 - v2).get();
        int menorDeLaLista1 = lista1.stream().min((v1, v2) -> v1 - v2).get();
        int menorDeLaLista2 = lista2.stream().min((v1, v2) -> v1 - v2).get();

        // se comprueba cual lista tiene el mayor en ambas y el menor en ambas
        if (mayorDeLaLista1 > mayorDeLaLista2){
            System.out.println("el mayor está en la lista 1 y es: " + mayorDeLaLista1);
        }else{
            System.out.println("el mayor está en la lista 2 y es: " + mayorDeLaLista2);
        }

        if (menorDeLaLista1 < menorDeLaLista2){
            System.out.println("el menor está en la lista 1 y es: " + menorDeLaLista1);
        }else{
            System.out.println("el menor está en la lista 2 y es: " + menorDeLaLista2);
        }
    }
}
