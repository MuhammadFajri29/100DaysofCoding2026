import java.util.Scanner;

public class Days73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         int pilihan;
 
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Halo");
            System.out.println("2. Tentang");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = in.nextInt();
 
            if (pilihan == 1) {
                System.out.println("Halo, selamat belajar Java!");
            } else if (pilihan == 2) {
                System.out.println("Ini latihan do while.");
            } else if (pilihan == 0) {
                System.out.println("Sampai jumpa!");
            } else {
                System.out.println("Pilihan salah.");
            }
        } while (pilihan != 0);

        in.close();
    }
}
