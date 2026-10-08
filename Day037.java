import java.util.Scanner;
public class Days37 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Masukkan Bilangan: ");
      int b = in.nextInt();

      if (b > 0) {
        System.out.println("Bilangan Positif");
      } else if (b < 0) {
        System.out.println("Bilngan Negatif");
      } else {
        System.out.println("Bilangan Nol");
      }

      in.close();
    }
}
