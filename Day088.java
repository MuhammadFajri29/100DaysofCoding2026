import java.util.Scanner;

public class Days88 {

    static String sapa(String nama) {
        return "Halo, " + nama + "!";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = in.nextLine();
        System.out.println(sapa(nama));

        in.close();
    }
}
