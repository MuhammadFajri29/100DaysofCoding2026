import java.util.Scanner;
public class Days19 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       System.out.print("Masukkan harga: ");
       int h = in.nextInt();
       System.out.print("Masukkan diskon: ");
       double d = in.nextDouble();
       double hsd = h - (h * d / 100);
       int hasil = (int) hsd;
       
       System.out.println("======================");
       System.out.println("Harga awal: " + h);
       System.out.println("Harga setelah diskon: " + hsd);
       System.out.println("Harga akhir: " + hasil);

       in.close();
    }
}
