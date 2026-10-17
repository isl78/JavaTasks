package thirdAssignment;

import java.util.Scanner;

public class TaskR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int cnt = 0;
        for (int i=0;i<=1000;i++){
            if ((a*Math.pow(i,3)+b*Math.pow(i,2)+c*i+d)/(i-e)==0) cnt++;
        }
        System.out.println(cnt);
    }
}
