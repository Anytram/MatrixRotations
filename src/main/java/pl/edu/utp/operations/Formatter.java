/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.utp.operations;

import java.util.Arrays;

/**
 *
 * @author Martyna Tarczewska
 */
public class Formatter {

    public int[][] formatInput(String[] text) {

        int[] arr;
        int[][] matrix;
        int k = 0;

        try {

            arr = Arrays.stream(text)
                    .map(String::trim).mapToInt(Integer::parseInt).toArray();

            matrix = new int[(int) Math.sqrt(arr.length)][(int) Math.sqrt(arr.length)];

            for (int[] matrix1 : matrix) {
                for (int j = 0; j < matrix1.length; j++) {
                    matrix1[j] = arr[k];
                    k++;
                }
            }

//            for (int[] matrix1 : matrix) {
//                for (int j = 0; j < matrix1.length; j++) {
//                    System.out.printf("%5d ", matrix1[j]);
//                }
//                System.out.println();
//            }
            return matrix;
        } catch (NumberFormatException e) {
            return null;
        }
    }

   public String formatOutput(double[][] table) {
        
        String[][] tempResult = new String[table.length][table.length];
        String result = "";

        
         for (int i = 0; i < tempResult.length; i++) {
                for (int j = 0; j < tempResult[i].length; j++) {
                    
                    tempResult[i][j] = Double.toString(table[i][j]);
                }
            }
         
        for (String[] tempResult1 : tempResult) {
            for (String tempResult11 : tempResult1) {
                result += tempResult11 + "\t" +"\t";
            }
            result += "\n";
        }
        return result;
    }
   
   public String formatOutput(int[][] table) {
        
        double[][] tempResult = new double[table.length][table.length];
        
         for (int i = 0; i < tempResult.length; i++) {
                for (int j = 0; j < tempResult[i].length; j++) {
                    
                    tempResult[i][j] = (double)table[i][j];
                }
            }
       
        return Formatter.this.formatOutput(tempResult);
    }
   
   public double round(double number){
       
       int num = (int) (number*1000);
       return num/1000.0;
   }
}
