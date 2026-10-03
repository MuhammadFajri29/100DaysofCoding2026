import java.util.Scanner;
public class Days32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Total Kata  : ");
        int tk = in.nextInt();
        System.out.print("Masukkan Jumlah Salah: ");
        int js = in.nextInt();
        if (tk >= 40*5 && js <=5) {
            System.out.println("Hasil: Lolos Kualifikasi");
        }
        else {
            System.out.println("Hasil: Gagal");
        }

    in.close();
    }
}
