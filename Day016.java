import java.util.Scanner;
public class Days16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jam sekarang (0-23): ");
        int js = in.nextInt();

        System.out.print("Masukkan tambahan jam acara: ");
        int tj = in.nextInt();

        int totalJam = js + tj;

        int jamAcara =  totalJam % 24;

        System.out.println("Acara akan dimulai pukul: " + jamAcara + ":00");

        in.close();
        
    }
}
