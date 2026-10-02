import java.util.Scanner;
public class Days31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Usia: ");
        int mu = in.nextInt();
        System.out.print("isWithAdult: ");
        boolean wa = in.nextBoolean();
        boolean s = mu >= 17 ||  mu >= 13 && wa;;
        System.out.println("Izin Masuk ? " + s);

        in.close();

    }
}
