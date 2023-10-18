package Lesson_2;

import java.util.Scanner;

public class Task_2_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer ");
        int yourNumber = in.nextInt();

        int sum = 0;

        for (int i = 0; i < yourNumber; i++){
            sum = sum + i;
        }

        System.out.println(sum);

    }
}
