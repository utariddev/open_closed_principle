package org.utarid.noncompliant;

public class AreaCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        calculateArea(circle);

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        calculateArea(rectangle);
    }

    public static void calculateArea(Shape shape) {

        double area = 0;
        if (shape instanceof Circle circle) {
            area = circle.calculateArea();
        } else if (shape instanceof Rectangle rectangle) {
            area = rectangle.calculateArea();
        }

        System.out.println("non-compliant : " + area);
    }
}
