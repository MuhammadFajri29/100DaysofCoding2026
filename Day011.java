import java.util.Scanner; 
//Untuk mengimpor class Scanner agar program dapat menerima input dari keyboard

public class Days11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        // Dengan membuat objek Scanner untuk membaca input dari keyboard

        // Untuk Meminta pengguna agar memasukkan Nama lewat keyboard
        System.out.print("Masukkan Nama\t: ");
        //untuk menerima text kita gunakan "input.nextLine();"
        String nama = input.nextLine();

        // Untuk Meminta pengguna agar memasukkan NIM lewat keyboard
        System.out.print("Masukkan NIM\t: ");
        //untuk menerima text kita gunakan "input.nextLine();"
        String nim = input.nextLine();

        // Untuk Meminta pengguna agar memasukkan Nama lewat keyboard
        System.out.print("Masukkan Umur\t: ");
        //Untuk menerima Bilangan bulat kita "gunakan input.nextInt();
        int umur = input.nextInt();

        // Untuk Meminta pengguna agar memasukkan IPK lewat keyboard
        System.out.print("Masukkan IPK\t: ");
        // Untuk menerima bilangan desimal kita gunakan "input.nextDouble();"
        double ipk = input.nextDouble();

        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama \t: " + nama);
        System.out.println("NIM \t: " + nim);
        System.out.println("Umur \t: " + umur);
        System.out.println("IPK  \t: " + ipk);

        input.close();
    }
}
