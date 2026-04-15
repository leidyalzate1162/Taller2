package Punto7;

import java.util.Stack;
import java.util.Scanner;

public class Metodos7 {
    Validaciones7 v = new Validaciones7();

    public Stack<ObjDato7> LlenarPila(Stack<ObjDato7> p, Scanner sc) {
        boolean preguntar = true;
        while (preguntar) {
            ObjDato7 o = new ObjDato7();
            System.out.println("Digite el numero");
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

    public void ProcesarPila(Stack<ObjDato7> p) {
        int cont20_80 = 0;
        int contPositivos = 0;
        int suma80_200 = 0;

        System.out.println("--- Resultados de la Pila ---");
        
        // Usamos un for-each como en tus fotos para recorrer la pila
        for (ObjDato7 o : p) {
            int n = o.getNumero();

            // 1: Si el número es negativo calcule su cubo
            if (n < 0) {
                System.out.println("El cubo de " + n + " es: " + (n * n * n));
            }

            // 2: Números entre 20 y 80
            if (n >= 20 && n <= 80) {
                cont20_80++;
            }

            // 3: Cantidad de positivos
            if (n > 0) {
                contPositivos++;
            }

            // 4: Suma entre 80 y 200
            if (n >= 80 && n <= 200) {
                suma80_200 += n;
            }
        }

        System.out.println("Cantidad entre 20 y 80: " + cont20_80);
        System.out.println("Cantidad de positivos: " + contPositivos);
        System.out.println("Suma de numeros entre 80 y 200: " + suma80_200);
    }

    public void MostrarPila(Stack<ObjDato7> p) {
        for (ObjDato7 o : p) {
            System.out.print(" " + o.getNumero());
        }
        System.out.println();
    }
}

