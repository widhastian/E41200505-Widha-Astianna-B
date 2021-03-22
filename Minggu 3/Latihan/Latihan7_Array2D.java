/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanWSIBD;

/**
 *
 * @author hp
 */
public class Latihan7_Array2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] numbers = {{9,5,3,6,4}, {1,6,3,7,4}, {9,3,5,2,7}, {2,5,3,7,8}, {3,4,7,3,8}};
        for (int baris = 0; baris < 5; baris++) {
            for (int kolom = 0; kolom < 5; kolom++) {
                System.out.print(numbers[baris][kolom]+ "   ");
            }
            System.out.println(" ");
        }
    }
    
}
