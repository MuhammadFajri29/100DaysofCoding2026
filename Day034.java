import java.util.Scanner;
public class Days34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== RESTORAN SUP DAENG FIKI ===");
        System.out.print("Jumlah Porsi: ");
        int jp = in.nextInt();
        System.out.print("Total Kotor: Rp ");
        int tk = in.nextInt();
        System.out.print("Total Bersih: Rp ");
        int tb = in.nextInt();
        System.out.println("=========================");

        if (tk >= 100000 && tb < 85000 || jp >= 5){
            System.out.println("Status Promo: SELAMAT! Anda mendapatkan SUPER PROMO REGULER (DISKON 40%)!");
        } else if (tb >= 60000) {
            System.out.println("Status Promo: SELAMAT! Anda mendapatkan PROMO REGULER (DISKON 15%)!");
        } else {
            System.out.println("Status Promo: TIDAK DAPAT DISKON DISKON (0%)!");
        }

        in.close();
        
    }
}
