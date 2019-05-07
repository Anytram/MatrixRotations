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
public class Transposition {
    
    private Formatter parser = new Formatter();
    
    public String rotate(int[][] originTab){
        
        int size = originTab.length;
        double[][] rotatedTab = new double[size][size];
        
         for (int i = 0; i < rotatedTab.length; i++) {
            for (int j = 0; j < rotatedTab[i].length; j++) {
                rotatedTab[i][j] = originTab[j][i];
            }
        }  
         return  parser.formatOutput(rotatedTab);
    }

}
