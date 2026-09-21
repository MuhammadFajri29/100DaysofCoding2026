import java.util.Scanner;
public class Days20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = in.nextInt();

        String as = String.valueOf(a);
        String hs = as + as;
        System.out.println("Hasil string: " + hs);
        System.out.println("Panjang teks: " + hs.length());

        in.close();


    }
}
