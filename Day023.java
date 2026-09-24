import java.util.Scanner;
public class Days23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Panjang Sisi: ");
        int s = in.nextInt();

        int l = s * s;
        System.out.println("Luas Persegi: " + l);
      
        in.close();
    }
}
