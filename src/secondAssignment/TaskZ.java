package secondAssignment;

import java.util.Scanner;

public class TaskZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a%100 >= 11 && a%100<= 14) System.out.println(a + " bochek");
        else if (a % 10 == 1) System.out.println(a + " bochka");
        else if (a % 10 >= 2 && a % 10 <= 4) System.out.println(a + " bochki");
        else System.out.println(a + " bochek");
    }
}
