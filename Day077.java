public class Days77 {
    public static void main(String[] args) {
        String a = "Ilham main Bola";
        String b = "Ilham main Bola";

        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase("ilham main bola"));
        System.out.println("Ilham main Bola".contains("Ilham"));
        System.out.println(a.isEmpty());
        System.out.println(a.substring(0,6));
        System.out.println(a.replace("Ilham", "Asep"));
        System.out.println(a.trim());


    }
}
