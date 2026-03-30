import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        try {
            int[][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            };

            Scanner sc = new Scanner(System.in);
            System.out.print("Input: ");
            int cari = sc.nextInt();

            boolean found = false;

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == cari) {
                        System.out.println("Found " + cari + " at [" + i + "][" + j + "]");
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }

        } catch (Exception e) {
            System.out.println("Input tidak valid!");
        }
    }
}