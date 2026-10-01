import java.util.Scanner;
public class Days30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Usia: ");
        int mn = in.nextInt();
        boolean s1 = mn >= 20;
        boolean s2 = mn <= 15;
        System.out.println("Usia >= 20: " + s1);
        System.out.println("Usia <= 15: " + s2);

        in.close();
    }
}
