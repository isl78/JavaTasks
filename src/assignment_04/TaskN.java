package assignment_04;

import java.util.Scanner;

public class TaskN {
    public static int transformDigits(int a) {
        int result = 0;
        int power = 0;
        while (a != 0) {
            int power22 = (int)Math.pow(10,power);
            int otk = a % 10;
            if (otk % 2 == 0) result += (otk+1)*power22;
            else result += (otk-1)*power22;
            a /= 10;
            power++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(transformDigits(num));
    }
}
