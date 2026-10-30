import java.util.Scanner;

public class Days59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         System.out.print("Masukkan nilai M (kelipatan): ");
        int m = in.nextInt();

        System.out.print("Masukkan nilai N (batas akhir): ");
        int n = in.nextInt();

        System.out.println("Kelipatan " + m + " dari 1 sampai " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i + " ");
            }
        }

        in.close();
    }
}
