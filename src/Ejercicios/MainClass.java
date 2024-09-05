package Ejercicios;

import OperacionesMatriz.Matriz;
import java.util.Scanner;
/**
 *
 * @author AguidoRin
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número de filas:");
        int n = sc.nextInt();
        
        System.out.println("Introduce el número de columnas:");
        int m = sc.nextInt();
        
        int[][] A = new int[n][m];
        
        Matriz mat=new Matriz();
        
        mat.SetMatriz(A);
        Matriz.PrintMatriz(A);
        mat.LastMat(A);
        
        
        //Estes es el cambio
    }
}