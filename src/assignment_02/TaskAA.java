package assignment_02;

import java.util.Scanner;

public class TaskAA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int cnt = 0;
        if (a%2==0 || b%2==0 || c%2==0) cnt+=1;
        if (a%2==1 || b%2==1 || c%2==1) cnt+=1;

        if (cnt==2) System.out.println("YES");
        else System.out.println("NO");
    }
}
