package Lesson_2;

import java.util.Scanner;

public class Task_1_1 {
    public static void main(String[] args) {

        String timeOfTheYear;

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of month");
        int numberOfMonth = in.nextInt();

        switch (numberOfMonth){
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("the Fall");
                break;
            case 10:
                System.out.println("the Fall");
                break;
            case 11:
                System.out.println("the Fall");
                break;
            case 12:
                System.out.println("Winter");
                break;
        }
    }
}
