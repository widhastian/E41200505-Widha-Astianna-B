package LatihanWSIBD;
import java.util.Scanner;
public class Latihan8_ConditionalStatement {
    public static void main(String[] args) {
        int nilai;
        String grade;
        Scanner abc = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai : ");
        nilai = abc.nextInt();
        
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C+";
        } else if (nilai >= 50) {
            grade = "D";
        } else if (nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("Grade : " +grade);
    }
    
}
