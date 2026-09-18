import java.util.Scanner;

public class Days17 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Masukkan poin awal pelanggan: ");
    int pa = in.nextInt();

    System.out.print("Masukkan poin transaksi baru: ");
    int pb = in.nextInt();
    
    System.out.print("Masukkan poin yang ditukarkan: ");
    int pd = in.nextInt();

    System.out.println("=== Riwayat Perubahan Poin ===");

    System.out.println("Poin Awal: " + pa);
    pa += pb;
    System.out.println("Setelah tambah transaksi: " + pa);
    pa -= pd;
    System.out.println("Setelah tukar poin\t: " + pa);
    pa *=2;
    System.out.println("Setelah promo Double Points: " + pa);
    pa = pa;
    System.out.println("Poin Akhir Pelanggan\t: " + pa);
    in.close();

    }
}
