import java.util.Scanner;

public class Days12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        // Dengan membuat objek Scanner untuk membaca input dari keyboard

        String nama, nim, jurusan, alamat;
        int umur;
        double ipk;

        System.out.println("=== BIODATA MAHASISWA ===");

        // Untuk Meminta pengguna agar memasukkan Nama lewat keyboard
        System.out.print("Masukkan Nama\t: ");
        //untuk menerima text kita gunakan "input.nextLine();"
        nama = input.nextLine();

        // Untuk Meminta pengguna agar memasukkan NIM lewat keyboard
        System.out.print("Masukkan NIM\t: ");
        //untuk menerima text kita gunakan "input.nextLine();"
        nim = input.nextLine();
        
        // Untuk Meminta pengguna agar memasukkan Jurusan lewat keyboard
        System.out.print("Masukkan Jurusan: ");
        //untuk menerima text kita gunakan "input.nextLine();"
        jurusan = input.nextLine();

        // Untuk Meminta pengguna agar memasukkan Alamat lewat keyboard
        System.out.print("Masukkan Alamat\t: ");
         //untuk menerima text kita gunakan "input.nextLine();"
        alamat = input.nextLine();

        // Untuk Meminta pengguna agar memasukkan Umur lewat keyboard
        System.out.print("Masukkan Umur\t: ");
        //Untuk menerima Bilangan bulat kita "gunakan input.nextInt();
        umur = input.nextInt();

        // Untuk Meminta pengguna agar memasukkan IPK lewat keyboard
        System.out.print("Masukkan IPK\t: ");
        // Untuk menerima bilangan desimal kita gunakan "input.nextDouble();"
        ipk = input.nextDouble();

        System.out.println("\n=== Biodata Anda ===");
        System.out.println("Nama \t: " + nama);
        System.out.println("NIM \t: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Alamat \t: " + alamat);
        System.out.println("Umur \t: " + umur);
        System.out.println("IPK  \t: " + ipk);

        input.close();
    }
}
