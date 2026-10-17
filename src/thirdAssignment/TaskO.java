package thirdAssignment;

import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int cnt = 0;
        for (int i=1;i<=a;i++){
            int num = input.nextInt();
            if (num==0) cnt++;
        }
        if (cnt>0) System.out.println("YES");
        else System.out.println("NO");
    }
}
