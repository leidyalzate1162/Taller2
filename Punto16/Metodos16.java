package Punto16;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Metodos16 {
    Validaciones16 v = new Validaciones16();

    public Stack<ObjData16> llenarPila(Stack<ObjData16> p, Scanner sc) {
        boolean preguntar = true;
        while (preguntar) {
            ObjData16 o = new ObjData16();
            System.out.println("Digite el numero:");
            int numero = v.ValidarEntero(sc);
            o.setNumero(numero);
            p.push(o);
            System.out.println("desea continuar 1) si, 2) no");
            int opt = sc.nextInt(); 
            if (opt == 2) {
                preguntar = false;
            }
        }
        return p;
    }

    // 1: Factorial de cada elemento
    public void mostrarFactorial(Stack<ObjData16> p) {
        for (ObjData16 o : p) {
            int n = o.getNumero();
            long f = 1;
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
            System.out.println("Factorial de " + n + " es: " + f);
        }
    }

    // 2: Ordenar mayor a menor (Usando un arreglo simple, sin Collections)
    public void ordenarMayorMenor(Stack<ObjData16> p) {
        int tam = p.size();
        int[] arr = new int[tam];
        int idx = 0;
        for (ObjData16 o : p) {
            arr[idx++] = o.getNumero();
        }

        // Metodo burbuja simple
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
        System.out.print("Ordenados mayor a menor: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    // 3: Serie Fibonacci de cada elemento
    public void mostrarFibonacci(Stack<ObjData16> p) {
        for (ObjData16 o : p) {
            int n = o.getNumero();
            System.out.print("Fibonacci de " + n + ": ");
            int a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int sig = a + b;
                a = b;
                b = sig;
            }
            System.out.println();
        }
    }

    // 4: Matriz cuadrada de cada elemento
    public void mostrarMatriz(Stack<ObjData16> p) {
        for (ObjData16 o : p) {
            int n = o.getNumero();
            if (n > 0) {
                System.out.println("Matriz de " + n + "x" + n + ":");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("[" + n + "]");
                    }
                    System.out.println();
                }
            }
        }
    }

    // 5: Si es negativo multiplicarlo por el cubo (n * n * n)
    public void negativoAlCubo(Stack<ObjData16> p) {
        for (ObjData16 o : p) {
            int n = o.getNumero();
            if (n < 0) {
                int cubo = n * n * n;
                System.out.println("El numero " + n + " al cubo es: " + cubo);
            }
        }
    }

    public void MostrarPila(Stack<ObjData16> p) {
        for (ObjData16 o : p) {
            System.out.print(" " + o.getNumero());
        }
        System.out.println();
    }
} 

