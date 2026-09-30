public class Days27 {
    public static void main(String[] args) {
        int skor_muzi = 8;
        int skor_fiki = 9;
        System.out.println("Skor Awal -> Muzi: " + skor_muzi + " | Fiki: " + skor_fiki);

        System.out.println("Muzi mendapat poin!!");
        skor_muzi++;

        System.out.println("Fiki terkena penalti!!");
        skor_fiki--;

        System.out.println("Muzi mendapat poin!!");
        skor_muzi++;

        System.out.println("Skor Akhir -> Muzi: " + skor_muzi + " | Fiki: " + skor_fiki);
    }
}
