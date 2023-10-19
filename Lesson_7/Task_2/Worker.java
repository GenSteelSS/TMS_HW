package Lesson_7.Task_2;

public class Worker implements PrintName{
    String position = "Worker";

    @Override
    public void printName() {
        System.out.println(position);
    }
}
