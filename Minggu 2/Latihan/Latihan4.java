/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanWSIBD;

import java.util.Scanner;

public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("Masukan angka1 = ");
        int angka1 = s1.nextInt();
        System.out.print("Masukan angka2 = ");
        int angka2 = s1.nextInt();
        
        int hasil = angka1 + angka2;
        System.out.println("Hasil = "+hasil);
    }
    
}
