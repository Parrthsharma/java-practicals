class Shape {
  
    public void draw() {
        System.out.println("Drawing a generic shape with default settings.");
    }

    public void draw(String color) {
        System.out.println("Drawing shape with color: " + color);
    }

    public void draw(int thickness, String color) {
        System.out.println("Drawing shape with thickness " + thickness + " and color " + color);
    }


    public double calculateArea() {
        return 0.0;
    }
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

   
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}


public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("=== Compile-Time Polymorphism (Method Overloading) ===");
        Shape s = new Shape();
        s.draw();
        s.draw("Red");
        s.draw(3, "Blue");

        System.out.println("\n=== Run-Time Polymorphism (Method Overriding & Parent References) ===");
        
      
        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Rectangle(4.0, 6.0);

        System.out.println("Area of Circle: " + shape1.calculateArea());
        System.out.println("Area of Rectangle: " + shape2.calculateArea());
    }
}
