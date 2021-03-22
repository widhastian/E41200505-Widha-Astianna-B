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
public class Latihan6_Array1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = {3, 6, 2, 6, 12, 8};
        String[] text = {"saya","masih","dalam","tahap","belajar"};
        
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int j=0; j<text.length; j++) {
            System.out.print(text[j]);
            System.out.print(" ");
        }
    }
    
}
