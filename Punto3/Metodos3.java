package Punto3;

import java.util.Stack;
import java.util.Scanner;

public class Metodos3 {
    Validaciones3 v = new Validaciones3();

    public Stack<ObjData3> LlenarPila(Stack<ObjData3> p, Scanner sc) {
        boolean preguntar = true;
        while (preguntar) {
            ObjData3 o = new ObjData3();
            System.out.println("Digite el numero");
            int num = v.ValidarEntero(sc);
            o.setNumero(num);
            p.push(o);

            System.out.println("desea continuar 1) si, 2) no");
            int opt = sc.nextInt();
            if (opt == 2) {
                preguntar = false;
            }
        }
        return p;
    }

    public void MostrarPila(Stack<ObjData3> p) {
        for (ObjData3 o : p) {
            System.out.print(" " + o.getNumero());
        }
        System.out.println();
    }

    // Método para validar y reemplazar según tus reglas
    public void ProcesarPila(Stack<ObjData3> p) {
        for (ObjData3 o : p) {
            int n = o.getNumero();
            
            // 1- Si es negativo reemplazarlo por 0
            if (n < 0) {
                o.setNumero(0);
            } 
            // 2- Si está entre 8 y 20 reemplazar por 50
            else if (n >= 8 && n <= 20) {
                o.setNumero(50);
            } 
            // 3- Si es mayor que 60 y menor que 62 reemplazar por 100
            else if (n > 60 && n < 62) {
                o.setNumero(100);
            }
        }
    }
}
