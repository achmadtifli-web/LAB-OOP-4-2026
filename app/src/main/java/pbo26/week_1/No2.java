import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input (dd-mm-yy): ");
        String input = sc.nextLine();

        String[] bulan = {"Januari","Febru","Maret","April","Mei","Juni",
                          "Juli","Agustus","September","Oktober","November","Desember"};

        String[] bagian = input.split("-");

        int hari = Integer.parseInt(bagian[0]);
        int bln = Integer.parseInt(bagian[1]);
        int thn = Integer.parseInt(bagian[2]);

        if (thn <= 25) thn += 2000;
        else thn += 1900;

        System.out.println(hari + " " + bulan[bln-1] + " " + thn);
    }
}