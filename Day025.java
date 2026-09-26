import java.util.Scanner;
public class Days25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jari-jari: ");
        double r = in.nextDouble();

        double luas = Math.PI*r*r;
        long j = (long) luas;

        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Luas Lingkaran: " + j);

        in.close();
    }
}
