public class Days7 {
    public static void main(String[] args) {
        String nama = "Muhammad Fajri";
        String salam = "Selamat pagi!";
        String kata = "Sesi Potret";
        // String dalam pemrograman (khususnya Java) adalah tipe data yang digunakan untuk menyimpan teks atau rangkaian karakter
        
        System.out.println(salam);
        // Fungsi string length adalah method bawaan String untuk menghitung jumlah karakter
        System.out.println("Panjang teks: " + nama.length());
        // Fungsi string UpperCase adalah mengubah semua karakter jadi huruf kapital
        System.out.println("Huruf besar\t: " + salam.toUpperCase());
        // Fungsi string LowerCase adalah mengubah semua karakter jadi huruf kecil
        System.out.println("Huruf kecil\t: " + kata.toLowerCase());
        
    }
}
