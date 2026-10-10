import java.util.Scanner;
public class Days39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.print("Masukkan angka pertama : ");
        int a = in.nextInt();
        
        System.out.print("Masukkan operator (+, -, *, /, %) : ");
        char op = in.next().charAt(0);
 
        System.out.print("Masukkan angka kedua   : ");
        int b = in.nextInt();
 
        int h = 0;
        boolean v = true;
         if (op == '+') {
            h = a + b;
        } else if (op == '-') {
            h = a - b;
        } else if (op == '*') {
            h = a * b;
        } else if (op == '/') {
            h = a / b;
        } else if (op == '%') {
            h = a % b;
        } else {
            System.out.println("Error: operator tidak dikenal!");
            v = false; 
        }

         if (v) {
            System.out.println("Hasil: " + a + " " + op + " " + b + " = " + h);
        }

        in.close();

    }
}
