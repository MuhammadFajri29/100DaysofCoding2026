public class BiodataDiri {
    public static void main(String[] args) {

        // println() Digunakan untuk mencetak data dan otomatis berpindah baris
        System.out.println("=== BIODATA DIRI ===");
        System.out.println("Nama: Muhammad Fajri");

        // print() Digunakan untuk mencetak data tanpa otomatis berpindah baris
        System.out.print("NIM: ");
        System.out.print("H0725004");
        System.out.println();

        // printf() Digunakan untuk mencetak data dengan format tertentu
        // string: Digunakan untuk mencetak data berupa teks
        // int: Digunakan untuk mencetak data bilangan bulat
        // %s: Digunakan untuk menampilkan tipe data string
        // %n: Digunakan untuk pindah baris
        // %d: Digunakan untuk menampilkan tipe data bilangan bulat
        String prodi = "Pendidikan Teknologi Informasi";
        int umur = 19;

        System.out.printf("Program Studi: %s%n", prodi);
        System.out.printf("Umur: %d tahun%n", umur);
    }
}
