package Assignments;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your overwall marks: ");
        int marks = in.nextInt();
        System.out.println(Grade(marks));
    }

    public static String Grade (int marks) {
        String ans = "";
        if (100 >= marks || marks >= 91) {
            ans = "AA";
        }
        else if (90 >= marks || marks <= 81) {
            ans = "AB";
        }
        else if (80 >= marks || marks <= 71) {
            ans = "BB";
        }
        else if (70 >= marks || marks <= 61) {
            ans = "BC";
        }
        else if (60 >= marks || marks <= 51) {
            ans = "CD";
        }
        else if (50 >= marks || marks <= 41) {
            ans = "DD";
        }
        else {
            ans = "Fail";
        }
        return ans;
    }
}