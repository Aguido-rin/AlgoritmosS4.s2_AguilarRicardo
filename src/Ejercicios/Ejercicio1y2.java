package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author AguidoRin
 */
public class Ejercicio1y2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número de filas:");
        int n = sc.nextInt();
        
        System.out.println("Introduce el número de columnas:");
        int m = sc.nextInt();
        
        int[][] A = new int[n][m];
        //llenado del arreglo números
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = (int) (Math.random() * 100);
            }
        }
        
        System.out.println("La matriz completa es:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("La última fila de la matriz es:");
        for (int j = 0; j < A[A.length - 1].length; j++) {
            System.out.print(A[A.length - 1][j] + " ");
        }
        System.out.println("");
        
        int mayor=0,a=0,b=0;
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j]>mayor){
                    mayor = A[i][j];
                    a = i; b = j;
                }
            }
        }
        System.out.println("\nEl mayor valor es: "+mayor);
        System.out.println("Fila: ");
        for (int i = 0; i < A[a].length; i++) {
            System.out.print(A[a][i] + " ");
        }
        System.out.println();
        System.out.println("Columna: ");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i][b] + " ");
        }
        
    }
}