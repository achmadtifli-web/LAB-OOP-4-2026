import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String pass = sc.nextLine();

        boolean adaHurufBesar = false;
        boolean adaHurufKecil = false;
        boolean adaAngka = false;

        if (pass.length() >= 8) {
            for (int i = 0; i < pass.length(); i++) {
                char c = pass.charAt(i);

                if (Character.isUpperCase(c)) adaHurufBesar = true;
                else if (Character.isLowerCase(c)) adaHurufKecil = true;
                else if (Character.isDigit(c)) adaAngka = true;
            }
        }

        if (adaHurufBesar && adaHurufKecil && adaAngka)
            System.out.println("Password valid");
        else
            System.out.println("Password tidak valid");
    }
}