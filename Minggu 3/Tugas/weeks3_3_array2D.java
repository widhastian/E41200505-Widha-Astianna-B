package TugasWSIBD;

public class weeks3_3_array2D {

    public static void main(String[] args) {
        // TODO code application logic here
        int [][] angka = {{5,6,1,7},{8,1,2,9},{5,4,7,1},{8,3,7,5}};
        for (int baris = 0; baris < 4; baris++) {
            for (int kolom = 0; kolom < 4; kolom++) {
                System.out.print(angka[baris][kolom]+"  ");
            }
            System.out.println(" ");
        }
    }
    
}


