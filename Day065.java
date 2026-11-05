import java.util.Scanner;

public class Days65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Tinggi: ");
        int t = in.nextInt();

        int a = 1;
        for(int i = t; i >= 1; i--) {
            System.out.println("*");
        }

        in.close();
    }
}
