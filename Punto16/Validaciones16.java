package Punto16;
import java.util.Scanner;

public class Validaciones16 {
    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor digite un numero");
            sc.nextLine();
        }
        int n = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        return n;
    }

    public int ValidarRango(int n1, int n2, int numero, Scanner sc) {
        while (numero < n1 || numero > n2) {
            System.out.println("Por favor ingrese un rango de: " + n1 + " hasta " + n2);
            numero = ValidarEntero(sc);
        }
        return numero;
    }
}