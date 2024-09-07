package Ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String imput=JOptionPane.showInputDialog("Ingrese el tamaño de la matrz cuadrada");
        int n = Integer.parseInt(imput);
        int[][] matriz = new int[n][n];

        // Llenamos la matriz con valores aleatorios
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 100); // Números aleatorios entre 0 y 99
            }
        }

        // Imprimimos la matriz
        System.out.println("Matriz :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Creamos un vector para almacenar los elementos de la diagonal principal
        int[] diagonalPrincipal = new int[n];

        // Extraemos los elementos de la diagonal principal
        for (int i = 0; i < n; i++) {
            diagonalPrincipal[i] = matriz[i][i];
        }

        // Imprimimos el vector con los elementos de la diagonal principal
        System.out.println("\nElementos de la diagonal principal:");
        for (int i = 0; i < n; i++) {
            System.out.print(diagonalPrincipal[i] + " ");
        }
    }
}
