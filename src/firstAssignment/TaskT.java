package firstAssignment;

import java.util.Scanner;

public class TaskT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int res1 = a/1000*10;
        int res11 = a/100%10;
        int res2 = a/10%10;
        int res22 = a%10*10;

        int resFr= res1+res11;
        int resSc = res22+res2;
        int resTh = resFr-resSc+1;
        System.out.println(resTh);

    }
}
