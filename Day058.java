import java.util.Scanner;

public class Days58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka N: ");
        int a = in.nextInt();

        System.out.print("Angka ganjil 1 sampai N-1: ");
        for (int i = 1; i <= a - 1; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.print("Angka genap 1 sampai N-1: ");
        for (int i = 1; i <= a - 1; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        in.close();
    }
}
