package Ejercicios;

import OperacionesMatriz.Arreglos;
import javax.swing.JOptionPane;
/**
 * Crear una matriz de 2 filas y 5 columnas y pasar a un vector todos los
 * números de 2 dígitos, luego imprima el vector.
 *
 * @author SergioSenior
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        String entFila = JOptionPane.showInputDialog(null, "Ingrese numero de filas");
        String entColumna = JOptionPane.showInputDialog(null, "Ingrese numero de columnas");

        int[][] A = Arreglos.LeerMatriz(entFila, entColumna);

        //hallando la cantidad de numeros de 2 digitos
        int n = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] < 100 && A[i][j] > 9) {
                    n++;
                }
            }
        }

        //Guardando en el vector B
        int[] B = new int[n];
        int menor = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] < 100 && A[i][j] > 9) {
                    B[menor] = A[i][j];
                    menor++;
                }
            }
        }
        
        //Resultados
        Arreglos.ImpMatriz("Matriz", A);
        Arreglos.ImpVector("Numero de dos digitos de la matriz", B);
    }

}