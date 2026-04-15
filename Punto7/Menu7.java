package Punto7;

import java.util.Scanner;
import java.util.Stack;

public class Menu7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos7 m = new Metodos7();
        Validaciones7 v = new Validaciones7();
        Stack<ObjDato7> pila = new Stack<>();
        boolean seguir = true;
        int opt = 0;

        while (seguir) {
            System.out.println("\n--- MENU PILA ---");
            System.out.println("1) Llenar Pila");
            System.out.println("2) Mostrar Pila");
            System.out.println("3) Procesar y Calcular");
            System.out.println("4) Salir");
            
            opt = v.ValidarEntero(sc);
            opt = v.ValidarRango(1, 4, opt, sc);

            switch (opt) {
                case 1:
                    pila = new Stack<>();
                    pila = m.LlenarPila(pila, sc);
                    break;
                case 2:
                    m.MostrarPila(pila);
                    break;
                case 3:
                    m.ProcesarPila(pila);
                    break;
                case 4:
                    System.out.println("Gracias por venir");
                    seguir = false;
                    break;
            }
        }
    }
} 
    

