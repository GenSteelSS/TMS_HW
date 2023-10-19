package Lesson_3;

import java.util.Scanner;

public class Task_1_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number ");
        int yourNumber = in.nextInt();

        int[] arr = new int[yourNumber];
        int maxValue = arr[0];
        int minValue = arr[0];
        int sum = 0;
        double avgValue;

        for (int i =0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10);
            System.out.println(arr[i]);
        }


        for (int i =0; i < arr.length; i++){
            if (arr[i] < minValue){
               minValue = arr[i];
           }
        }
        System.out.println("Min" + minValue);

        for (int i =0; i < arr.length; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println("Max" + maxValue);

        for (int i = 0; i < yourNumber; i++){
            sum += arr[i];
        }
        avgValue = (double)sum / yourNumber;

        System.out.println("AVG" + avgValue);

    }
}
