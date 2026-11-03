import java.util.Scanner;

public class Days63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan M (bilangan pokok): ");
        int m = in.nextInt();
        System.out.print("Masukkan N (pangkat): ");
        int n = in.nextInt();

        long hasil = 1;              
        for (int i = 1; i <= n; i++) {
            hasil = hasil * m;        
        }

        System.out.println(m + " pangkat " + n + " = " + hasil);
        in.close();
    }
}
