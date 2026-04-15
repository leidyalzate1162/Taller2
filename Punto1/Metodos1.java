package Punto1;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


public class Metodos1 {
    
    public int[][]LlenarMatriz(int [][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j]=(int)(Math.random()* 10 + 1);
            }            
        }
        return m;
    }
    public void MostrarMatriz(int [][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
               System.out.print(m[i][j] + "  ");
            }  
            System.out.println();          
        }
    }
    public Stack<Integer> SumaFilas(int[][]m){
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < m.length; i++) {
          int suma = 0;
          for (int j = 0; j < m.length; j++) {
            suma += m[i][j];
          }  
          pila.push(suma);
        }
        return pila;
    }
    public Queue<Integer> SumaColumnas(int[][]m){
        Queue<Integer> cola = new LinkedList<>();
        for (int j = 0; j < m.length; j++) {
          int suma = 0;
          for (int i = 0; i < m.length; i++) {
            suma += m[i][j];
          }  
          cola.offer(suma);
        }
        return cola;
}
public int factorial(int n){
    int f = 1;
        for (int i = 1; i <=n; i++) {
            f *=i;
          }  
        
        return f;
}
 public Queue<Integer> ordenarCola(Queue<Integer> cola) {
        Queue<Integer> ordenada = new LinkedList<>();
        while (!cola.isEmpty()) {

            int mayor = cola.peek();
            for (int num : cola) {
                if (num> mayor) {
                    mayor = num;
                }
            }
            boolean eliminado = false;
            int size = cola.size();

            for (int i = 0; i < size; i++) {
                int num = cola.remove();

                if (num == mayor && !eliminado) {
                    eliminado = true;
                } else {
                    cola.offer(num);
                }
            }
            ordenada.offer(mayor);
        }
        return ordenada;
    }
}

