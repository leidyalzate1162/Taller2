package Punto4;

import java.util.Scanner;
import java.util.Stack;

public class Metodos4 {

    // Método de validación (basado en foto "Validaciones.P.C.L")
    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor digite un numero");
            sc.nextLine();
        }
        return sc.nextInt();
    }

    // Llenado de pila (basado en foto "Metodos.P.C.L")
    public Stack<Objetual4> llenarPila(Stack<Objetual4> p, Scanner sc) {
        boolean preguntar = true;
        while (preguntar) {
            System.out.println("Digite el numero para la pila");
            int num = ValidarEntero(sc);
            Objetual4 o = new Objetual4(num);
            p.push(o);
            
            System.out.println("desea continuar 1) si , 2) no");
            int opt = sc.nextInt();
            if (opt == 2) {
                preguntar = false;
            }
        }
        return p;
    }

    // Lógica de búsqueda solicitada
    public void buscarEnPila(Stack<Objetual4> p, Scanner sc) {
        // Regla 2: Si la pila está vacía, volver al proceso de llenado
        if (p.isEmpty()) {
            System.out.println("La pila esta vacia. Debe llenarla primero.");
            llenarPila(p, sc);
        }

        System.out.println("Ingrese el numero que desea buscar:");
        int buscar = ValidarEntero(sc);
        
        boolean encontrado = false;
        int posicion = -1;

        // Regla 1: Si no se encuentra, el proceso se repite (lo manejamos con un bucle)
        while (!encontrado) {
            // Buscamos en una copia para no destruir la pila original al mostrar
            Stack<Objetual4> copia = (Stack<Objetual4>)p.clone();
            int contadorPosicion = 1;
            
            while (!copia.isEmpty()) {
                Objetual4 aux = copia.pop();
                if (aux.getNumero() == buscar) {
                    encontrado = true;
                    posicion = contadorPosicion;
                    break; 
                }
                contadorPosicion++;
            }

            if (encontrado) {
                // Regla 3: Mostrar posición y terminar
                System.out.println("Valor encontrado en la posicion: " + posicion);
            } else {
                System.out.println("No se encontro el caracter. Intente de nuevo.");
                System.out.println("Ingrese el numero que desea buscar:");
                buscar = ValidarEntero(sc);
            }
        }
    }
} 

