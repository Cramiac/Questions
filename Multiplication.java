package Assignments;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.println(Mul(num1, num2));
    }

    public static int Mul (int num1, int num2) {
        int ans = 0;
        ans = num1 * num2;
        return ans;
    }
}