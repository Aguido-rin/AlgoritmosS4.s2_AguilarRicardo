/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad4;

import java.util.Scanner;

/**
 *
 * @author robert
 */
public class Imprimir {
    public static void Imprimir(int[][] matriz){
        for (int[] is : matriz) {
            for (int i : is) {
                System.out.print(i+"\t");
            }
            System.out.println("");
        }
    }
    public static int[][] CrearMatriz(Scanner scan){
        System.out.println("Ingrese num de filas:");
        int filas=scan.nextInt();
        System.out.println("Ingrese num de columnas");
        int columnas=scan.nextInt();  
        int [][]Matriz=new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese Matriz["+i+"]["+j+"]:");
                Matriz[i][j]=scan.nextInt();
            }
        }
        return Matriz;   
    }
}
