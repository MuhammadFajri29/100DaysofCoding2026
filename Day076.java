import java.util.Scanner;

public class Days76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        String b = "  Agus tinggi  ";

        System.out.println(a.substring(0,3));
        System.out.println(b.replace("Agus" , "Asep"));
        System.out.println(b.trim());
        
        in.close();
    }
}
 
