import java.util.Scanner;
public class Days26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka a: ");
        int a = in.nextInt();
        System.out.print("Masukkan Angka b: ");
        int b = in.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Hasil a: " + a);
        System.out.println("Hasil b: " + b);
        in.close();
    }
}
