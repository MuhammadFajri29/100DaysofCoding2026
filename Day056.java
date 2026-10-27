import java.util.Scanner;

public class Days56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int a = in.nextInt();

        System.out.println("Urutan 1 Sampai " + a + ":");
        for (int i = 1; i <= a; i++)
        System.out.print(i + " " ); {
    }
        System.out.println();

         System.out.println("Urutan " + a + " sampai 1:");
        for (int i = a; i >= 1; i--) {
            System.out.print(i + " ");
        }
        
    System.out.println();
    in.close();
}

}
