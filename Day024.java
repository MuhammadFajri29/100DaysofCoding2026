import java.util.Scanner;
public class Days24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Panjang: ");
        double mp = in.nextDouble();
        System.out.print("Masukkan Lebar: ");
        double ml = in.nextDouble();

        double pm = mp / 100;
        double lm = ml / 100;
        double lm2 = pm * lm;
        
        System.out.println("=== HASIL PERHITUNGAN ===");
        System.out.println("Panjang: " + mp + " cm");
        System.out.println("Lebar  : " + ml + " cm");
        System.out.println("Luas   : " + lm2 + " m²");

        in.close();

    }
}
