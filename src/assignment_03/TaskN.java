package assignment_03;

import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int cntZero = 0;
        int cntPos = 0;
        int cntNeg = 0;
        for (int i=1;i<=a;i++){
            int num = input.nextInt();
            if (num==0) cntZero++;
            else if (num>0) cntPos++;
            else cntNeg++;
        }
        System.out.println(cntZero);
        System.out.println(cntPos);
        System.out.println(cntNeg);

    }
}
