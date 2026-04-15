package Punto5;

import java.util.Scanner;
import java.util.Stack;

public class Main5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos5 m = new Metodos5();
        Stack<ObjDato5> pilaFactoriales = new Stack<>();
        
        System.out.println("Ingrese el tamano del vector:");
        int tam = m.ValidarEntero(sc);
        int[] vector = new int[tam];

        // Llenado del vector
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese numero para la posicion [" + i + "]:");
            vector[i] = m.ValidarEntero(sc);
        }

        // Procesamiento: de Vector a Pila de Factoriales
        pilaFactoriales = m.procesarFactoriales(vector);

        // Mostrar resultados
        System.out.println("Factoriales en la Pila:");
        m.MostrarPila(pilaFactoriales);
        
        System.out.println("Proceso finalizado.");
    }
}

