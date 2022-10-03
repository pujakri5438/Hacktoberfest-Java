//package Java-Coding-Practice;

import java.util.Scanner;

public class CheckPrime {
    public static void prime(int n) {
        int flag = 0;
        for(int i = 2;i <= n;i++)
        {
            if(n % i == 0)
            {
                System.out.print("Not Prime");
                break;
            }
            else
            {
                System.out.print("Prime"); 
                break;
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);
    }
}
