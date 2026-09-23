public class Days22 {
    public static void main(String[] args) {
        String KB = "500";
        int SB = 12;
        
        int KB1 = Integer.parseInt(KB);
        String SB1 = String.valueOf(SB);

        System.out.println("=== SEBELUM DITUKAR ===");
        System.out.println("KodeBarang: " + KB);
        System.out.println("StokBarang: " + SB);

        System.out.println("\n=== SETELAH DITUKAR ===");
        System.out.println("KodeBarang: " + SB1 + 10);
        System.out.println("StokBarang: " + (KB1 + 10));
        
    }
}
