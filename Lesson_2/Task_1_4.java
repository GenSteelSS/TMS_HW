package Lesson_2;

import java.util.Scanner;

public class Task_1_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number ");
        int temperature = in.nextInt();

        if (temperature > -5){
            System.out.println("Тепло");
        } else if (temperature <= -5 || temperature  >= -20){
            System.out.println("Норм");
        } else
            System.out.println("Холодно");
    }
}
