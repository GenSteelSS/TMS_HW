package Lesson_3;

import java.util.Scanner;

public class Task_1_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number ");
        int yourNumber = in.nextInt();

        int arr[] = {1, 5, 9, 88 ,12, 45, 63};

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == yourNumber){
                System.out.println("Your number is in the array");
            }else
                System.out.println("Your number is not in the array");
        }
    }
}
