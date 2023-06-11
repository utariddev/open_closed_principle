package org.utarid.compliant;

public class AreaCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        calculateArea(circle);

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        calculateArea(rectangle);
    }

    public static void calculateArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("compliant : " + area);
    }
}
