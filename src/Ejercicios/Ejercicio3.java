package Ejercicios;

import OperacionesMatriz.Imprimir;
import java.util.Scanner;
/**
 *
 * @author Robertototo
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int [][]Matriz=Imprimir.CrearMatriz(scan);
        System.out.println("Su matriz Original:");
        Imprimir.Imprimir(Matriz);
        System.out.println("Su matriz en Orden de T");
        int aux=0;
        for (int i = 0; i < Matriz.length; i++) { 
            aux = Matriz[0][i];    
            Matriz[0][i] = Matriz[i][1]; 
            Matriz[i][1] = aux; 
        }
        Imprimir.Imprimir(Matriz);
        System.out.println("Tamaño de la matriz");
        System.out.println(Matriz.length);
    }   
}
