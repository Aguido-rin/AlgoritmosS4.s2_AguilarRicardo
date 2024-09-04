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
                System.out.println("Pocisión ["+i+"]["+j+"]");
                A[i][j] = sc.nextInt();
            }
        }
        return A;
    }
    
    public static int[][] PrintMatriz(int[][] A){
        System.out.println("La matriz completa es:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        return A;
    }
    
    public int[] LastMat(int[][] A){
        System.out.println("La última fila de la matriz es:");
        for (int j = 0; j < A[A.length - 1].length; j++) {
            System.out.print(A[A.length - 1][j] + " ");
        }
        return A[A.length - 1];
    }
}