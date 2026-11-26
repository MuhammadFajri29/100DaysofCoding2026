import java.util.Scanner;

public class Days82 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String a = in.nextLine();
       int b = in.nextInt();

       for(int i = 1; i <= b; i++) {
        System.out.println(i + ". " + a);
       }
       in.close();
    }
}

