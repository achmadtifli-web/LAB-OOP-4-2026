import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String kalimat = sc.nextLine();

        String[] kata = kalimat.split(" ");
        String hasil = "";

        for (String k : kata) {
            hasil += k.substring(0,1).toUpperCase() + k.substring(1) + " ";
        }

        System.out.println("Output: " + hasil);
    }
}
