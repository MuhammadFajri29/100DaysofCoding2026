import java.util.Scanner;
public class Days40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Tampilan menu
        System.out.println("=== PEMBELIAN TIKET BIOSKOP ===");
        System.out.println("1. Regular  - Rp40000");
        System.out.println("2. Sweetbox - Rp60000");
        System.out.println("3. VIP      - Rp90000");
 
        // Input pengguna
        System.out.print("Pilih kategori (1-3): ");
        int p = in.nextInt();
        System.out.print("Jumlah tiket: ");
        int j = in.nextInt();
 
        String kt;
        int h;
 
        // Menentukan kategori dan harga
        switch (p) {
            case 1:
                kt = "Regular";
                h = 40000;
                break;
            case 2:
                kt = "Sweetbox";
                h = 60000;
                break;
            case 3:
                kt = "VIP";
                h = 90000;
                break;
            default:
                System.out.println("Kategori tidak tersedia");
                in.close();
                return; // program berhenti
        }
 
        // Perhitungan
        int tl = h * j;
        int d = 0;
 
        if (tl >= 150000) {
            d = tl * 15 / 100;
        }
 
        int tb = tl - d;
 
        // Output
        System.out.println();
        System.out.println("Kategori   : " + kt);
        System.out.println("Harga      : Rp" + h);
        System.out.println("Jumlah     : " + j);
        System.out.println("Total      : Rp" + tl);
        System.out.println("Diskon     : Rp" + d);
        System.out.println("Total Bayar: Rp" + tb);
 
        in.close();
    }
}
