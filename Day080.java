public class Days80 {
    public static void main(String[] args) {
        String[] buah = {"Jeruk", "Mangga", "Anggur", "Kelapa"};
        int[] nilai = {15,30,45,60,70};

        System.out.println(buah[2]);
        System.out.println(buah[buah.length - 1]);
        System.out.println(nilai[0]);
        buah[2] = "Semangka";
        System.out.println(buah[2]);
        System.out.println(nilai.length);

    }
}
