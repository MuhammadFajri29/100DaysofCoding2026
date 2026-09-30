import java.util.Scanner;
public class Days29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Harga: ");
        String hb = in.nextLine();
        System.out.print("Masukkan Jumlah: ");
        String jb = in.nextLine();
        int h = Integer.parseInt(hb);
        int j = Integer.parseInt(jb);
        int tb = (h * j);
        boolean status = tb > 50000;
        boolean status1 = tb < 50000;
        System.out.println("\n === CEK KELAYAKAN DISKON ===");
        System.out.println("Harga Buku: Rp " + hb);
        System.out.println("Jumlah Beli: " + jb);
        System.out.println("Total Belanja: Rp " + tb);
        System.out.println("\n === EVALUASI PERBANDINGAN ===");
        System.out.println("layak Dapat Diskon?: " + status);
        System.out.println("Pembelian Sedikit?: " + status1);

        in.close();

    }
}
