public class Days9 {
    public static void main(String[] args) {
        // Konstanta adalah sebuah nilai yang tetap dan tidak dapat diubah selama program berjalan. Dalam Java, konstanta biasanya dibuat menggunakan kata kunci final.

        final int NILAI_LULUS = 75;
        int nilai = 85;

        // if adalah jika nilai memenuhi batas nilai yang sudah ditetapkan
        // operator >= berarti lebih besar atau sama dengan
        if (nilai >= NILAI_LULUS) {
            System.out.println("Anda LULUS");
        // else adalah jika nilai tidak memenuhi batas nilai yang sudah ditetapkan
        } else {
            System.out.println("Anda TIDAK LULUS");
        }
    }
}
