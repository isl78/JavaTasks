package thirdAssignment;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int x = a;
        int cnt = 0;
        int sum = 0;
        while (x!=0){
            cnt+=1;
            x/=10;
        }

        while (cnt!=0){
            int last = a%10;
            int step = (int)Math.pow(10,cnt-1);
            sum += last*step;
            cnt--;
            a/=10;
        }
        System.out.println(sum);
    }
}
