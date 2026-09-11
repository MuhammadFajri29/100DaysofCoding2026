public class Days10 {
    public static void main(String[] args) {

        //Setiap tipe data numerik di Java memiliki batas minimal (minimum) dan batas maksimal (maximum).

        // Batas minimum dan maksimum tipe data byte 8 bit
        System.out.println("Byte minimum\t: " + Byte.MIN_VALUE);
        System.out.println("Byte maksimum\t: " + Byte.MAX_VALUE);

        // Batas minimum dan maksimum tipe data short 16 bit
        System.out.println("Short minimum\t:" + Short.MIN_VALUE);
        System.out.println("Short maksimum\t:" + Short.MAX_VALUE);

        // Batas minimum dan maksimum tipe data int 32 bit
        System.out.println("Int minimum \t: " + Integer.MIN_VALUE);
        System.out.println("Int maksimum\t: " + Integer.MAX_VALUE);

        // Batas minimum dan maksimum tipe data long 64 bit
        System.out.println("Long minimum \t: " + Long.MIN_VALUE);
        System.out.println("Long maximum \t: " + Long.MAX_VALUE);

        // Batas minimum dan maksimum tipe data float 32 bit
        System.out.println("Float minimum\t: " + Float.MIN_VALUE);
        System.out.println("Float maksimum\t: " + Float.MAX_VALUE);

        // Batas minimum dan maksimum tipe data double 64 bit
        System.out.println("Double minimum\t: " + Double.MIN_VALUE);
        System.out.println("Double maksimum\t: " + Double.MAX_VALUE);

        // char digunakan untuk menyimpan satu karakter, tetapi sebenarnya nilainya berupa bilangan Unicode dari 0 sampai 65.535.
        System.out.println("Char minimum \t: " + (int) Character.MIN_VALUE);
        System.out.println("Char maximum \t: " + (int) Character.MAX_VALUE);
    }
}
