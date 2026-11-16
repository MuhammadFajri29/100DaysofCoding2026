import java.util.Scanner;

public class Days76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();

        System.out.println("Awal: " + a.substring(0,3));
        System.out.println("Akhir: " + a.substring(a.length()-3));
        
        in.close();
    }
}
