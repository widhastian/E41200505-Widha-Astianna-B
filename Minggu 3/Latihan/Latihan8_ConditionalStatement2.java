package LatihanWSIBD;
import java.util.Scanner;
public class Latihan8_ConditionalStatement2 {
    public static void main(String[] args) {
        String lampu;
        Scanner abc = new Scanner(System.in);
        
        System.out.print("Masukkan nama warna : ");
        lampu = abc.nextLine();
        
        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("Warna Lampu Salah!");
        }
    }
    
}
