import java.util.Scanner;
public class Days48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka A: ");
        double a = in.nextDouble();
        System.out.print("Masukkan Operator (+, -, *, /, %): ");
        char c = in.next().charAt(0);
        System.out.print("Masukkan Angka B: ");
        double b = in.nextDouble();

        switch (c) {
            case '+':
                System.out.println("Hasil: " + a + " + " + b + " = " + (a+b));
                break;
            case '-':
                System.out.println("Hasil: " + a + " - " + b + " = " + (a-b));
                break;
            case '*':
                System.out.println("Hasil: " + a + " * " + b + " = " + (a*b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Pembagian dengan nol tidak bisa");
                }
                else {
                    System.out.println("Hasil: " + a + " / " + b + " = " + (a/b));
                }
                break;
            case '%':
                 if (b == 0) {
                    System.out.println("Error: Modulus dengan nol tidak bisa");
                }
                else {
                    System.out.println("Hasil: " + a + " % " + b + " = " + (a/b));
                }
                break;
            default:
                System.out.println("Operator tidak valid");
        }

        in.close();
    }
}
