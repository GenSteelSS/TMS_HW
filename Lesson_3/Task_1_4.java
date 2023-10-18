package Lesson_3;

import java.util.Arrays;

public class Task_1_4 {
    public static void main(String[] args) {
        int[] a = {1, 5, 7, 2, 9};
        int[] b = {3, 5, 2, 2, 8};
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < a.length; i++){
            sumA += a[i];
        }
        double avgA = (double)sumA / a.length;

        for (int i = 0; i < b.length; i++){
            sumB += b[i];
        }
        double avgB = (double)sumB / b.length;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        if(avgA > avgB) {
            System.out.println("AVG a > b");
        } else if (avgA < avgB) {
            System.out.println("AVG a < b");
        } else
        System.out.println("AVG a = b");
    }
}
