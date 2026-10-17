package thirdAssignment;

import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        int cnt = 0;
        for (long i=1;i*i<=a;i++){
            if(a%i==0) {
                cnt++;
                if (i!=a/i) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
