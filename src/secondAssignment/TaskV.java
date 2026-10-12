package secondAssignment;

import java.util.Scanner;

public class TaskV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a >= 10 && a <= 20) System.out.println(a + " korov");
        else if (a % 10 == 1) System.out.println(a + " korova");
        else if (a % 10 >= 2 && a % 10 <= 4) System.out.println(a + " korovy");
        else System.out.println(a + " korov");
    }
}
