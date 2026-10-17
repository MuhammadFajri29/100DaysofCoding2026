import java.util.Scanner;
public class Days46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== SELAMAT DATANG DI KANTIN DELICIOUS ===");
        System.out.print("Masukkan Nama Pemesan: ");
        String np = in.nextLine();
        System.out.println("Pilih Kategori menu:");
        System.out.println("[M] Makanan:");
        System.out.println("[D] Minuman:");
        System.out.print("Masukkan pilihan kategori (M/D): ");
        char pk = in.next().charAt(0);
        String nm = "";
        double pm = 0;
        double hm = 0;
        double jp = 0;

        switch (pk) {
            case 'M':
                System.out.println("Kategori Makanan (Kode M)");
                System.out.println("1. Nasi Goreng Spesial (Rp 25.000)");
                System.out.println("2. Ayam Bakar Madu - Rp 30.000");
                System.out.println("3. Mie Goreng Seafood - Rp 22.000");

                System.out.print("Masukkan nomor pilihan makanan (1-3): ");
                pm = in.nextDouble();
                if (pm == 1) {
                    hm = 25000;
                    nm = "Nasi Goreng Spesial";
                }
                else if (pm == 2) {
                    hm = 30000;
                    nm = "Ayam Bakar Madu";
                }
                else if (pm == 3) {
                    hm = 22000;
                    nm = "Mie Goreng Seafood";
                }
                System.out.print("Masukkan jumlah porsi: ");
                jp = in.nextDouble();
                System.out.println("====================================");
                break;
                
                case 'D': 
                System.out.println("Kategori Minuman (Kode D)");
                System.out.println("1. Es Teh Manis (Rp 5.000)");
                System.out.println("2. Jus Jeruk Segar - Rp 10.000");
                System.out.println("3. Air Mineral - Rp 4.000");

                System.out.print("Masukkan nomor pilihan minuman (1-3): ");
                pm = in.nextDouble();
                if (pm == 1) {
                    hm = 5000;
                    nm = "Es Teh Manis";
                }
                else if (pm == 2) {
                    hm = 10000;
                    nm = "Jus Jeruk Segar";
                }
                 else if (pm == 3) {
                    hm = 4000;
                    nm = "Air Mineral";
                }
                System.out.print("Masukkan Jumlah Porsi: ");
                jp = in.nextDouble();
                System.out.println("====================================");
                break;
            }
            
            double th = hm * jp;
            System.out.println("STRUK PESANAN ANDA");
            System.out.println("====================================");
            System.out.printf("Nama Pemesan: %s%n" ,np);
            System.out.printf("Menu Dipilih: %s%n" , nm);
            System.out.printf("Harga Satuan: Rp %,.0f%n" , hm);
            System.out.printf("Jumlah Porsi: %,.0f%n" , jp);
            System.out.printf("------------------------ %n");
            System.out.printf("Total Harga: Rp %,.0f%n" , th);

            in.close();
    }
}
