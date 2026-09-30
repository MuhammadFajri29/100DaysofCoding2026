import java.util.Scanner;
public class Days28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Password Baru: ");
        int pb = in.nextInt();
        int pl = 737;
        boolean status = pl != pb;
        System.out.println("" + status + "! Password dapat digunakan");

        in.close();
    }
}
