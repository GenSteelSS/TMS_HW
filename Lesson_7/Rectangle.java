package Lesson_7;

public class Rectangle extends Figure {

    double sideA;
    double sideB;
    double square;
    double perimeter;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }


    @Override
    public double square() {
        square = sideA * sideB;
        return square;
    }

    @Override
    public double perimeter() {
        perimeter = (sideA + sideB) * 2;
        return perimeter;
    }
}
