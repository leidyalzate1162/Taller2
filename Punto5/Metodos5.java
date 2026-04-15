package Punto5;

import java.util.Scanner;
import java.util.Stack;

public class Metodos5 {
    
    
    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor digite un numero");
            sc.next();
        }
        return sc.nextInt();
    }

        public int calcularFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

        public Stack<ObjDato5> procesarFactoriales(int[] vector) {
        Stack<ObjDato5> pila = new Stack<>();
        for (int i = 0; i < vector.length; i++) {
            int resultado = calcularFactorial(vector[i]);
            ObjDato5 o = new ObjDato5();
            o.setNumero(resultado);
            pila.push(o);
        }
        return pila;
    }

        public void MostrarPila(Stack<ObjDato5> p) {
        for (ObjDato5 o : p) {
            System.out.print(" " + o.getNumero());
        }
        System.out.println();
    }
}

