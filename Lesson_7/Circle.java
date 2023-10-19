package Lesson_7;

public class Circle extends Figure {
    double radius;
    final double Pi = 3.14;
    double square;
    double perimeter;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public double square() {
        square = Pi * radius * radius;
        return square;
    }

    @Override
    public double perimeter() {
        perimeter = 2 * Pi * radius;
        return perimeter;
    }
}
