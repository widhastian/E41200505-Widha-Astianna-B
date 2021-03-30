/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasWSIBD.Minggu4;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class Perulangan_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String a = JOptionPane.showInputDialog("Masukkan Batas Nilai Awal =");
        String b = JOptionPane.showInputDialog("Masukkan Batas Nilai Akhir =");
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);*/
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Batas Nilai Awal = ");
        int awal = in.nextInt();
        System.out.print("Masukkan Batas Nilai Akhir = ");
        int akhir = in.nextInt();
        
        for (int i = awal; i <= akhir; i++)
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        
    }
    
}
