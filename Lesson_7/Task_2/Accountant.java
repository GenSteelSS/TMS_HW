package Lesson_7.Task_2;

public class Accountant implements PrintName{
    String position = "Accountant";

    @Override
    public void printName() {
        System.out.println(position);
    }
}
