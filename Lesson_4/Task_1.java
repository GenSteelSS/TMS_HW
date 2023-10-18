package Lesson_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number ");
        int yourNumber = in.nextInt();

        int [][][] arr = {{{1, 1}, {2, 2}, {3, 3}}, {{4, 4}, {5, 5,}, {6, 6}}, {{7, 7}, {8, 8}, {9, 9}}};
        for(int i = 0; i < 3; i++){
            for(int j =0; j < 3; j++){
                for(int k = 0; k < 2; k++){
                    arr[i][j][k] = arr[i][j][k] + yourNumber;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
