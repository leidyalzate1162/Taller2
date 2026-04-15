package Punto1;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;

public class Principal1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Metodos1 m = new Metodos1();
    System.out.println("Ingrese la dimension de la matriz:");
    int n = sc. nextInt();
    int[][] matriz = new int [n][n];
    
    matriz = m.LlenarMatriz(matriz);

        System.out.println("\nMatriz:");
        m.MostrarMatriz(matriz);

        int opcion = -1;

        while (opcion != 0) {

            System.out.println("\n--- MENU ---");
            System.out.println("1. Suma filas (Pila)");
            System.out.println("2. Suma columnas (Cola)");
            System.out.println("3. Factorial");
            System.out.println("4. Ordenar cola");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    Stack<Integer> pila = m.SumaFilas(matriz);
                    System.out.println("Pila: " + pila);
                    break;

                case 2:
                    Queue<Integer> cola = m.SumaColumnas(matriz);
                    System.out.println("Cola: " + cola);
                    break;

                case 3:
                    System.out.println("Factorial: " + m.factorial(n));
                    break;

                case 4:
                    Queue<Integer> c = m.SumaColumnas(matriz);
                    Queue<Integer> ordenada = m.ordenarCola(c);
                    System.out.println("Cola ordenada: " + ordenada);
                    break;

                case 0:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
    
}


   