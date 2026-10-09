import java.util.Scanner;
public class Days38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== MENU RESTORAN ===");
        System.out.println("1. Paket A - Rp25000");
        System.out.println("2. Paket B - Rp35000");
        System.out.println("3. Paket C - Rp45000");
        System.out.print("Pilih Paket: ");
        String p = in.next().toUpperCase();
        System.out.print("Jumlah: ");
        int j = in.nextInt();
        System.out.println();

        int h = 0;

         switch (p) {
            case "A":
                h = 25000;
                break;
            case "B":
                h = 35000;
                break;
            case "C":
                h = 45000;
                break;
            default:
                System.out.println("Paket tidak tersedia");
                return; // program berhenti
        }

        int t = h * j;
        int d = 0;
         if (t >= 100000) {
            d= t * 10 / 100;
        }

        int tb = t - d;
        System.out.println("Paket \t\t: " + p);
        System.out.println("Harga \t\t: Rp" + h);
        System.out.println("Jumlah \t\t: " + j);
        System.out.println("Total \t\t: Rp" + t);
        System.out.println("Diskon \t\t: Rp" + d);
        System.out.println("Total Bayar \t: Rp" + tb);

        in.close();

    }
}
