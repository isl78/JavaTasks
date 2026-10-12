package secondAssignment;

import java.util.Scanner;

public class TaskX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int t60 = n / 60;
        int rem60 = n % 60;
        int t20 = 0, t10 = 0, t5 = 0, t1 = 0;

        if (rem60 >= 36) {
            t60++;
        } else {
            t20 = rem60 / 20;
            int rem20 = rem60 % 20;
            if (rem20 >= 18) {
                t20++;
            } else {
                t10 = rem20 / 10;
                int rem10 = rem20 % 10;
                if (rem10 == 9) {
                    t10++;
                } else {
                    t5 = rem10 / 5;
                    t1 = rem10 % 5;
                }
            }
        }
        System.out.println(t1 + " " + t5 + " " + t10 + " " + t20 + " " + t60);
    }
}
