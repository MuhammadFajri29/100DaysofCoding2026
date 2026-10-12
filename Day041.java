import java.util.Scanner;

public class Days41 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Masukkan Jari-Jari: ");
    double j = in.nextDouble();
    final double pi = 3.141591111111111;
    double k = 2 * pi * j;
    double l = pi * j * j;
    double ba = l * 150000;

    double D = 0;
    if (ba >= 50000000) {
        D = ba * 0.1;
    } else if (ba >= 2000000) {
        D = ba * 0.05;
        
    }
    else {
        System.out.println();
        
    }
    double tb = ba - D;

    System.out.println("=== RINCIAN BIAYA RENOVASI ===");
System.out.printf("Keliling Lapangan  : %.2f m%n", k );
System.out.printf("Luas Lapangan      : %.2f m2%n", l );
System.out.printf("Total Biaya Awal   : Rp %,.2f%n", ba);
System.out.printf("Diskon             : Rp %,.2f%n", D);
System.out.printf("Total Biaya Akhir  : Rp %,.2f%n", tb);

    in.close();
    
} 
}
