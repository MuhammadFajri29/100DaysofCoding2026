public class Days75 {
    public static void main(String[] args) {
        String teks1 = "Agus";
        String teks2 = "agus";

        System.out.println(teks1.equals(teks2));          
        System.out.println(teks1.equalsIgnoreCase(teks2)); 
        System.out.println("Agus lapar buk".contains("Agus")); 
        System.out.println("Agus".isEmpty());          
    }
}
