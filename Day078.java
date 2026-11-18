import java.util.Scanner;

public class Days78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

         // ===== BAGIAN 1: MEMBUAT AKUN =====
        System.out.println("=== BUAT AKUN ===");
        System.out.print("Masukkan username baru : ");
        String username = in.nextLine();
        System.out.print("Masukkan password baru : ");
        String password = in.nextLine();
        System.out.println("Akun berhasil dibuat!\n");

        // ===== BAGIAN 2: LOGIN =====
        System.out.println("=== LOGIN ===");
        String inputUser, inputPass;

        do {
            System.out.print("Username : ");
            inputUser = in.nextLine();
            System.out.print("Password : ");
            inputPass = in.nextLine();

            if (!inputUser.equals(username) || !inputPass.equals(password)) {
                System.out.println("Username atau password salah, coba lagi!\n");
            }
        } while (!inputUser.equals(username) || !inputPass.equals(password));

        System.out.println("\nLogin berhasil! Selamat datang, " + username + ".");

        in.close();
    }
}
