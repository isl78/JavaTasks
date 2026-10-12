package secondAssignment;

import java.util.Scanner;

public class TaskW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t60 = n / 60;
        int r = n % 60;
        int t10 = r / 10;
        int t1 = r % 10;
        if (t1 * 15 >= 125) {
            t1 = 0;
            t10++;
        }
        if (t10 * 125 + t1 * 15 >= 440) {
            t60++;
            t10 = 0;
            t1 = 0;
        }
        System.out.println(t1 + " " + t10 + " " + t60);
    }
}
