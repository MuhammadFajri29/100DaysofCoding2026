public class Days85 {
    public static void main(String[] args) {
         int[] angka = {25, 8, 41, 3, 17, 29};

        int min = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }

        System.out.println("Angka minimal: " + min);
    }
}
