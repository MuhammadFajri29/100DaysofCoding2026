import java.util.Scanner;
public class Days15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai a = ");
        int a = in.nextInt();

        System.out.print("Masukkan Nilai b = ");
        int b = in.nextInt();

        int c = a * b;

        System.out.println("===================");

        System.out.println("Nilai a Kali b = " + c);

        int d = a / b;

        System.out.println("Nilai a Bagi b = " + d);

    }
}
