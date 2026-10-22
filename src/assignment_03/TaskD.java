package assignment_03;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int d = input.nextInt();
        int cnt = 0;
        while (x!=0){
            int last = x%10;
            if (last==d) cnt++;
            x/=10;
        }
        System.out.println(cnt);
    }
}
