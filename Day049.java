import java.util.Scanner;
public class Days49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int n = in.nextInt();

        String h = (n >= 75) ? "Lulus" : "Tidak Lulus";

        System.out.println("Hasil: " + h);

        in.close();
    }
}
