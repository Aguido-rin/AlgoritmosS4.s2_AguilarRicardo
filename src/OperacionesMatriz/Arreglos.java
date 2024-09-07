package OperacionesMatriz;

import java.util.Random;

/**
 * 2. Construya un programa que guarde los menores elementos de cada fila a un
 * vector de una matriz de tamaño NxM
 *
 * @author SERGIO
 */
public class Arreglos {

    public static Random rd = new Random();

    public static void ImpMatriz(String msj, int A[][]) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.println("");
        }
    }

    public static int[][] LeerMatriz(String entFila, String entColumna) {
        int nfilas = Integer.parseInt(entFila);
        int ncolumnas = Integer.parseInt(entColumna);

        int A[][] = new int[nfilas][ncolumnas];
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncolumnas; j++) {
                A[i][j] = rd.nextInt(99)+1;
            }
        }
        return A;
    }

    public static void ImpVector(String msj, int A[]) {
        System.out.println(msj);
        for (int elemento : A) {
            System.out.print("\t" + elemento);
        }
        System.out.println("");
    }
}
