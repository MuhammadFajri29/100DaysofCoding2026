import java.util.Scanner;
public class Days43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Batas Angka: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " = Kelipatan 3 dan 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " = Kelipatan 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " = Kelipatan 5");
            } else {
                System.out.println(i);
            }
        }
        in.close();
    }
}
