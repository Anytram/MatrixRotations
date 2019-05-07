/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.operations;

/**
 *
 * @author Martyna Tarczewska
 */
public class MatrixRotation {

    private Formatter parser = new Formatter();

    public String rotate(int[][] originTab, double degrees) {

        double sina, cosa;
        int size = originTab.length;
        double[][] temp = new double[size][size];
        double[][] rotatedTab = new double[size][size];
        double[][] rotationmatrix = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                temp[i][j] = originTab[i][j];
            }
        }

//         for (int[] matrix1 : originTab) {
//            for (int j = 0; j < matrix1.length; j++) {
//                System.out.printf("%5d ", matrix1[j]);
//            }
//            System.out.println();
//        }
        sina = Math.sin(Math.toRadians(degrees));
        cosa = Math.cos(Math.toRadians(degrees));

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 && j == 0) {
                    rotationmatrix[i][j] = cosa;
                } else if (i == 0 && j == 1) {
                    rotationmatrix[i][j] = -sina;
                } else if (i == 1 && j == 0) {
                    rotationmatrix[i][j] = sina;
                } else if (i == 1 && j == 1) {
                    rotationmatrix[i][j] = cosa;
                } else if (i == j && j > 1) {
                    rotationmatrix[i][j] = 1;
                } else {
                    rotationmatrix[i][j] = 0;
                }
            }
        }

//        for (double[] matrix1 : rotationmatrix) {
//            for (int j = 0; j < matrix1.length; j++) {
//                System.out.printf("%5f ", matrix1[j]);
//            }
//            System.out.println();
//        }
        

        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
//                    System.out.println("i =" + i + "\n" + "j =" + j + "\n" + "k= " + k + "\n " + rotationmatrix[k][i] + "   * " + rotatedTab[j][k] + "  =  " + (rotationmatrix[i][k] * temp[k][j]));

                    sum += rotationmatrix[k][i] * temp[j][k];

                }
//                System.out.println("suma: " + sum);
                rotatedTab[j][i] = parser.round(sum);
                sum = 0.0;
            }
        }
//        for (double[] matrix1 : rotatedTab) {
//            for (int j = 0; j < matrix1.length; j++) {
//                System.out.printf("%5f ", matrix1[j]);
//            }
//            System.out.println();
//        }
     return parser.formatOutput(rotatedTab);
    }
}
