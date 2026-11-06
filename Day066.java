import java.util.Scanner;

public class Days66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Panjang Garis: ");
        int pg = in.nextInt();

        for (int i = 1; i <= pg; i++) {
            System.out.print("*");
        }

        in.close();
    }
}
