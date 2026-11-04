import java.util.Scanner;

public class Days64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Angka: " );
        int a = in.nextInt();

        long b = 1;
        for (int i = a; i>= 1; i--) {
			b*=i;
		}	
		System.out.print(b);

        in.close();
    }
}
