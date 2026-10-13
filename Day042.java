import java.util.Scanner;
public class Days42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== PERHITUNGAN GAJI BERSIH ===");
        System.out.print("Gaji Pokok: " + "Rp ");
        double gp = in.nextDouble();
        System.out.print("Tunjangan: " + " Rp ");
        double t = in.nextDouble();
        double gk = gp + t;
        
        double p = 0;
        if (gk >5000000) {
            p = gk * 0.1;
        } else if (gk <=5000000) {
            p = gk * 0.05;
            
        }
        else {
            System.out.println();
        }
        double gb = gk - p;

        System.out.println("---------------------");
        System.out.println("Gaji Kotor: " + "Rp " + gk);
        System.out.println("Potongan Pajak (10%): " + "Rp " + p);
        System.out.println("---------------------");
        System.out.println("Gaji Bersih: " + "Rp " + gb);

        in.close();
    }
}
