package Lesson_7;

public class Main {

    public static void main(String[] args) {
        double summ = 0;

        Figure[] figure = {new Circle(5), new Rectangle(4, 5), new Triangle(3,4,5)};
        for (Figure fig : figure){
            summ += fig.perimeter();
        }
        System.out.println("Сумма периметров: " + summ);
    }
}
