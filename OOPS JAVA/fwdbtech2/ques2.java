package b_tech_assignment2;

abstract class Shape {
    protected int length;
    protected int width;

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void printArea() {
        int area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void printArea() {
        double area = 0.5 * length * width;
        System.out.println("The area of the triangle is: " + area);
    }
}

class Circle extends Shape {
    public Circle(int length, int width) {
        super(length, width);
    }

    @Override
    public void printArea() {
        double radius = 0.5 * width;
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}

public class ques2 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        rectangle.printArea();

        Shape triangle = new Triangle(10, 20);
        triangle.printArea();

        Shape circle = new Circle(0, 20);
        circle.printArea();
    }
}
