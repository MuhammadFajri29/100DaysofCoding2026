import java.util.Scanner;

public class Days60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = in.nextInt();

        int tl = 0;
        for (int i = 1; i <= n; i++) {
            tl += i;
        }

        System.out.println("Jumlah angka 1 sampai " + n + " = " + tl);
        in.close();
    }
}
