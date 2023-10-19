package Lesson_7.Task_2;

public class Director implements PrintName {
    String position = "Director";
    @Override
    public void printName() {
        System.out.println(position);
    }
}
