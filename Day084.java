public class Days84 {
    public static void main(String[] args) {
         int[] angka = {12, 45, 7, 70, 23, 48};

        int max = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }

        System.out.println("Angka maksimal: " + max);
    }
}
