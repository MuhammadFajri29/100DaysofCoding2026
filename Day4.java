public class Days4 {
    public static void main(String[] args) {
        
        // tipe data numerik bilangan bulat byte 8 bit. Rentang byte yaitu -127 - 128
        byte beratbadan = 75;
        System.out.printf("berat badan\t:%d kg%n", beratbadan);

        // tipe data numerik bilangan bulat short 16 bit. Rentang short yaitu -32.768 - 32.767
        short lebartabung = 3229;
        System.out.printf("Lebar tabung\t:%,d m%n", lebartabung);

        // tipe data numerik bilangan bulat int 32 bit. Rentang int yaitu -2.147.483.648 - 2.147.483.647
        int totalharga = 560000;
        System.out.printf("Total harga\t:Rp%,d%n",totalharga);

        // tipe data numerik bilangan bulat long 64 bit. Rentang long yaitu -9.223.372.036.854.775.808 
        long kerugian = 25700000000000L;
        // nilai long yang melampaui batas nilai int harus menggunakan suffix (L) di akhir angka menunjukkan bahwa angka tersebut merupakan literal bertipe long
        System.out.printf("Kerugian\t:Rp%,d%n",kerugian);
    }
}
