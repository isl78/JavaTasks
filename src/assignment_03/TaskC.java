package assignment_03;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        for (int i=a;i<=b;i++){
            for (int z=1;z*z<=i;z++) {
                if (z * z == i){
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
