package TugasWSIBD;
import java.util.Scanner;
public class week3_4_syntax1 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        String nama;
        int harga_1, harga_2, harga_3, harga_4, harga_5;
        double hasil;
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("                  Kharisma Agung Plaza ( KAP )                  ");
        System.out.println("                     Promo Belanja Berhadiah                    ");
        System.out.println("               Khusus Pembelian 5 Barang Pertama                ");
        System.out.println("                Dengan harga minimum Rp 10000,00                ");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        nama = abc.nextLine();
        System.out.println("");
        System.out.print("Masukan harga barang ke-1 : ");
        harga_1 = abc.nextInt();
        System.out.print("Masukan harga barang ke-2 : ");
        harga_2 = abc.nextInt();
        System.out.print("Masukan harga barang ke-3 : "); 
        harga_3 = abc.nextInt();
        System.out.print("Masukan harga barang ke-4 : ");
        harga_4 = abc.nextInt();
        System.out.print("Masukan harga barang ke-5 : ");
        harga_5 = abc.nextInt();
        
        hasil = harga_1 + harga_2 + harga_3 + harga_4 + harga_5;
        System.out.println("Total harga pembelian atas nama "+nama +" adalah Rp "+hasil );
        System.out.println("");
        if (hasil > 10000) {
            System.out.println("Selamat.....");
            System.out.println("Anda mendapatkan 1 buah mug cantik");
        } else {
            System.out.println("Terima Kasih atas kunjungan anda");
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                         Terima Kasih                            ");
        System.out.println("          Anda sudah belanja di Kharisma Agung Plaza             ");
    }
    
}
