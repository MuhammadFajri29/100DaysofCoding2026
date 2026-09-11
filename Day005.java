public class Days5 {
    public static void main(String[] args) {

        // Variabel float digunakan jika data yang tidak butuh presisi tinggi.
        // Penulisannya harus pakai f di akhir.
        // Jika tidak memakai f di akhir angka desimal maka java akan menganggap variable double bukan float.
        float nilaiTugas = 80.5f;
        float nilaiUTS = 82.25f;
        float nilaiUAS = 85.0f;

        // Variabel double digunakan jika data yang butuh perhitungan akurat.
        // Tidak perlu menggunakan f di akhir.
        double bobotTugas = 0.3;
        double bobotUTS = 0.3;
        double bobotUAS = 0.4;

        // Perhitungan nilai akhir
        double nilaiAkhir = (nilaiTugas * bobotTugas) + 
                             (nilaiUTS * bobotUTS) + 
                             (nilaiUAS * bobotUAS);

        // Menampilkan hasil
        System.out.println("=== NILAI SISWA ===");
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai UAS   : " + nilaiUAS);
        System.out.println("-------------------");
        System.out.println("Bobot Tugas : " + bobotTugas);
        System.out.println("Bobot UTS   : " + bobotUTS);
        System.out.println("Bobot UAS   : " + bobotUAS);
        System.out.println("-------------------");
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}
