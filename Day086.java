import java.util.Arrays;
import java.util.Scanner;

public class Days86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {10, 11, 12, 13, 14};

        // tampilkan array awal
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // ubah: semua elemen dikali 2
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 2;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // tambah elemen di akhir
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[b.length - 1] = 23;
        a = b;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // urutkan
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // salin array
        int[] c = Arrays.copyOf(a, a.length);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        in.close();
    }
}
