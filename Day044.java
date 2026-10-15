import java.util.Scanner;
public class Days44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== SISTEM EVALUASI DIKLAT ===");
        System.out.print("Masukkan Nama Peserta: ");
        String p = in.nextLine();
        System.out.print("Masukkan Kode Jalur (R/P): ");
        char k = in.next().charAt(0);
        System.out.print("Masukkan Nilai Akhir (0-100): ");
        int n = in.nextInt();

        String j = "";
        String pr = "";
        if (k == 'R') {
            if (n > 90){
                j = "Reguler";
                pr = "Sangat Memuaskan";
            } else if (n >= 80) {
                j = "Reguler";
                pr = "Memuaskan";
            } else if (n <= 79 && n > 0) {
                j = "Reguler";
                pr = "Belum Lulus";
            }
        } 
        if (k == 'P') {
            if (n > 90) {
                j = "Profesional";
                pr = "Cumlaude";
            } else if (n >=80) {
                j = "Profesional";
                pr = "Sangat Baik";
            } else if (n <=79 && n > 0) {
                j = "Profesional";
            pr = "Baik";
        }
    }
        else {
            System.out.println();
        }
       
        System.out.println("------------------");
        System.out.println("HASIL EVALUASI PESERTA");
        System.out.println("------------------");
        System.out.println("Nama Peserta: " + p);
        System.out.println("Jenis Jalur: " + j);
        System.out.println("Nilai Akhir: " + n);
        System.out.println("Predikat: " + pr);
        System.out.println("------------------");

        in.close();
    }
}
