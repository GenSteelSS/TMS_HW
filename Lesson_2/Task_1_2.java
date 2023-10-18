package Lesson_2;

import java.util.Scanner;

public class Task_1_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of month");
        int numberOfMonth = in.nextInt();

        if (numberOfMonth == 12 || numberOfMonth == 1 || numberOfMonth == 2) {
            System.out.println("Winter");
        } else if (numberOfMonth == 3 || numberOfMonth == 4 || numberOfMonth == 5) {
            System.out.println("Spring");
        } else if (numberOfMonth == 6 || numberOfMonth == 7 || numberOfMonth == 8) {
            System.out.println("Summer");
        } else if (numberOfMonth == 9 || numberOfMonth == 10 || numberOfMonth == 11) {
            System.out.println("the Fall");
        }
    }
}