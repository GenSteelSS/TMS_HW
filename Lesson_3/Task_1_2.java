package Lesson_3;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number ");
        int yourNumber = in.nextInt();

        int[] arr = {1, 2, 3, 5, 7, 9, 3, 12, 5, 3, 8};
        int[] resultArr = new int[arr.length];
        int counter = 0;

        for (int i = 0; i < arr.length; i = i + 1) {
            if (arr[i] != yourNumber) {
                resultArr[i - counter] = arr[i];
            } else {
                counter ++;
            }
        }
        if (counter == 0) {
            System.out.println("Array doesn't contains element: " + yourNumber);

        } else {
            int[] finalResult = new int[resultArr.length - counter];
            System.arraycopy(resultArr, 0, finalResult, 0, resultArr.length - counter);
            System.out.println(Arrays.toString(finalResult));
        }

    }
}
