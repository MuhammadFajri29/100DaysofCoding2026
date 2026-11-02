import java.util.Scanner;

public class Days62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int b = in.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int k = in.nextInt();

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        in.close();
    }
}
