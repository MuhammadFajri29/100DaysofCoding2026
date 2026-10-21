import java.util.Scanner;

public class Days50{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Harga Satuan: Rp ");
        double s = in.nextDouble();
        System.out.print("Jumlah Beli: ");
        double b = in.nextDouble();

        double ta = s * b;

        double d = (ta >= 100000) ? (ta * 0.1) : 0;
        double tb = ta - d;

        System.out.printf("Total Awal: Rp%.0f%n", ta);
        System.out.printf("Diskon (10%%): Rp%.0f%n", d);
        System.out.printf("Total Bayar: Rp%.0f%n", tb);
        in.close();
    }
}
