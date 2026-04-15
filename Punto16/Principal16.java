package Punto16;

import java.util.Scanner;
import java.util.Stack;

public class Principal16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos16 m = new Metodos16();
        Validaciones16 v = new Validaciones16();
        Stack<ObjData16> pila = new Stack<>();
        
        boolean seguir = true;
        while (seguir) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1: Llenar Pila / Factorial");
            System.out.println("2: Ordenar Mayor a Menor");
            System.out.println("3: Serie Fibonacci");
            System.out.println("4: Matriz Cuadrada");
            System.out.println("5: Negativos al Cubo");
            System.out.println("6: Salir");
            
            int opt = v.ValidarEntero(sc);
            opt = v.ValidarRango(1, 6, opt, sc);

            switch (opt) {
                case 1:
                    pila = m.llenarPila(pila, sc);
                    m.mostrarFactorial(pila);
                    break;
                case 2:
                    m.ordenarMayorMenor(pila);
                    break;
                case 3:
                    m.mostrarFibonacci(pila);
                    break;
                case 4:
                    m.mostrarMatriz(pila);
                    break;
                case 5:
                    m.negativoAlCubo(pila);
                    break;
                case 6:
                    System.out.println("Gracias por venir");
                    seguir = false;
                    break;
            }
        }
    }
} 
    

