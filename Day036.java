import java.util.Scanner;
public class Days36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Bilangan: ");
        int b = in.nextInt();
         if (b % 2 == 0) {
            System.out.println(b + " adalah bilangan genap");
        } else {
            System.out.println(b + " adalah bilangan ganjil");
        }

        in.close();
    }
}
