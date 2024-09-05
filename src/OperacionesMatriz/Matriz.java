package OperacionesMatriz;

import java.util.Scanner;
/**
 *
 * @author AguidoRin
 */
public class Matriz {
    
    Scanner sc = new Scanner(System.in);
    
    public int[][] SetMatriz(int[][] A){
        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("Pocisión [%d][%d]\n",i,j);
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("");
        return A;
    }
    
    public static int[][] PrintMatriz(int[][] A){
        System.out.println("La matriz completa es:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        return A;
    }
    
    public int[] LastMat(int[][] A){
        System.out.println("La última fila de la matriz es:");
        for (int j = 0; j < A[A.length - 1].length; j++) {
            System.out.print(A[A.length - 1][j] + " ");
        }
        System.out.println("");
        return A[A.length - 1];
    }
    
    public void MayVal(int[][] A){
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