package Punto4;

import java.util.Scanner;
import java.util.Stack;

public class Principal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos4 m = new Metodos4();
        Stack<Objetual4> pila = new Stack<>();
        
        boolean seguir = true;
        while (seguir) {
            System.out.println("\n--- MENU PILAS ---");
            System.out.println("1) Llenar Pila");
            System.out.println("2) Buscar Valor (Identificar)");
            System.out.println("3) Salir");
            
            int opt = m.ValidarEntero(sc);
            
            switch (opt) {
                case 1:
                    pila = m.llenarPila(pila, sc);
                    break;
                case 2:
                    m.buscarEnPila(pila, sc);
                    break;
                case 3:
                    System.out.println("Gracias por venir");
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}  

