/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasWSIBD.Minggu4;

/**
 *
 * @author hp
 */
public class Kelipatan_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("          Do_While          ");
        System.out.println("Bilangan Kelipatan 2 (1-100)");
        System.out.println("============================");
        
        int a = 1;
        int numbers = 1;
        do {
            numbers *= 2;
            System.out.print(numbers + " ");
            a++;
        } while (a <= 6);
    } 
    
}
