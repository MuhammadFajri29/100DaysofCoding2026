import java.util.Scanner;
public class Days21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama Mahasiswa: ");
        String nm = in.nextLine();
        System.out.print("Nilai Ujian: ");
        String nu = in.nextLine();
        System.out.print("Status Kelulusan: ");
        String sl = in.nextLine();

        Double n = Double.parseDouble(nu);
        Double h = n + 5;
        Boolean s = Boolean.parseBoolean(sl);

        System.out.println("=== LAPORAN NILAI MAHASISWA ===");
        System.out.println("Nama Mahasiswa: " + nm);
        System.out.println("Nilai Akhir: " + h);
        System.out.println("Status Lulus: " + s);

        in.close();
    }
}
