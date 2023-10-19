package Lesson_2;

import java.util.Scanner;

public class Task_1_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number ");
        int yourNumber = in.nextInt();

        if (yourNumber %2 == 0){
            System.out.print("Your number is even");

        } else
            System.out.println("Your number is not even");
    }
}
