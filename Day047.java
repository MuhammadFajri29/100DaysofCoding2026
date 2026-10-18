import java.util.Scanner;
public class Days47 {
    public static void main(String[] args) {
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka (1-7): ");
        int a = in.nextInt();
        String h = "";
        if (a >= 1 && a <= 7) {
            h = hari[a - 1];
        }
        else {
            System.out.println("Angka tidak valid");
        }
        System.out.println("Hari: " + h);

        in.close();

    }
}
