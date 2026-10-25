import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

         int hasil = x;

        if (y > x) {
            hasil += 1;
        } else if (y < x) {
            hasil -= 1;
        }

        if (z > x) {
            hasil += 2;
        } else if (z < x) {
            hasil -= 2;
        }

        System.out.println(hasil);

        in.close();
    }
}
