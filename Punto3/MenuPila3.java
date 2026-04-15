package Punto3;

import java.util.Stack;
import java.util.Scanner;

public class MenuPila3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos3 m = new Metodos3();
        Stack<ObjData3> pila = new Stack<>();
        
        System.out.println("--- Llenado de Pila ---");
        pila = m.LlenarPila(pila, sc);
        
        System.out.println("\nPila original:");
        m.MostrarPila(pila);
        
        // Ejecutar las validaciones de reemplazo
        m.ProcesarPila(pila);
        
        System.out.println("\nPila procesada (con reemplazos):");
        m.MostrarPila(pila);
        
        System.out.println("\nGracias por usar el programa.");
    }
}
