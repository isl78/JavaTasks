package assignment_03;

import java.util.Scanner;

public class TaskS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = 1;
        int obs = 0;
        while (n<=a){

                for (int k=1;k<=n;k++){
                    if (obs<a){
                    System.out.println(n);
                    obs+=1;
                    }
                }
            n++;

        }
    }
}
