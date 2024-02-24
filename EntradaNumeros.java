import java.util.Scanner;

public class EntradaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el primer número entero:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero:");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número entero:");
        int numero3 = scanner.nextInt();

        // Mostrar los datos ingresados
        System.out.println("\nNombre: " + nombre);
        System.out.println("Números ingresados: " + numero1 + ", " + numero2 + ", " + numero3);

        scanner.close();
    }
}