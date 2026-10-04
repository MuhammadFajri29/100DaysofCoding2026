import java.util.Scanner;
public class Days33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Panjang Sisi Alas (meter): ");
        int p = in.nextInt();
        System.out.print("Masukkan Tinggi Limas (meter): ");
        int t = in.nextInt();
        double luas = p*p;
        double volume = p*p*t/3;

        String kategori;
        if (volume > 5000) {
            kategori = "Skala Monumen Nasional";
        } else if (volume >= 1000) {
            kategori = "Skala Monumen Kota";
        } else {
            kategori = "Skala Dekorasi Taman";
        }

        System.out.println("=== SPESIFIKASI MONUMEN ===");
        System.out.println("Luas Alas Monumen : " + luas + " m2" );
        System.out.println("Volume Monumen    : " + volume + " m3");
        System.out.println("Kategori Skala    : " + kategori);

        in.close();
    }
}
