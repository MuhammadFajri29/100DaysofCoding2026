import java.util.Scanner;

public class Days61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = in.nextInt();

        long hl = 1;
        for (int i = 1; i <= n; i++) {
            hl *= i;
        }

        System.out.println("Hasil Perkalian 1 sampai " + n + " = " + hl);
        in.close();
    }
}
