import java.util.Scanner;
public class Days35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pilih Daya (1=900 VA, 2=1300 VA): ");
        int pd = in.nextInt();
        System.out.print("Subsidi? (1=Ya, 2=Tidak): ");
        int s = in.nextInt();
        System.out.print("Pemakaian (kWh): ");
        double p = in.nextDouble();
        
        double t = 0;
        double tg = 0;
        
        // Daya 900 VA
        if  (pd == 1) {

            // Subsidi
            if (s == 1) {
                t = 605;
                tg = p * t;
            } else {

                // Non-Subsidi
                if (p <= 100) {
                    t = 1352;
                    tg = p * t;
                }
                if (p > 100) {
                    t = 1444;
                    tg = p * t;
                }
            }

        // Daya 1300 VA
        } else if (pd == 2) {

            t = 1444.70;
            tg = p * t;

            // Tambahan biaya 10% 
            if (p > 300) {
                tg = tg + (tg * 10 / 100);
            }

        } else {
            System.out.println("Pilihan daya tidak valid!");
            return;
        }

        System.out.println("=== RINCIAN TAGIHAN PLN ===");

        if (pd == 1) {
            System.out.println("Daya Listrik: 900 VA");
        } else {
            System.out.println("Daya Listrik: 1300 VA");
        }

        System.out.println("Pemakaian: " + p + " kWh");
        System.out.println("Total Tagihan: Rp " + tg);

        in.close();
    }
}
