import java.util.Scanner;

public class Days55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int a = in.nextInt();

        if (a <= 15) {
            System.out.println("Mantap");
            return;
        }
         for (int i = 1; i <= a; i++) {
            if (i == 16) {
                break;
            }
            if (i % 4 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
