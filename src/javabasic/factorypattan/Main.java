package javabasic.factorypattan;

// 1. Shape Interface
interface Shape {
    void draw();
}

// 2. Circle class
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// 3. Square class
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

// 4. Rectangle class
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// 5. Factory class (Important part)
class ShapeFactory {

    // এই method বলবে কোন object create হবে
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}

// 6. Main class (Run and see magic)
public class Main {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.getShape("circle");
        s1.draw();   // => Drawing Circle

        Shape s2 = factory.getShape("square");
        s2.draw();   // => Drawing Square

        Shape s3 = factory.getShape("rectangle");
        s3.draw();   // => Drawing Rectangle
    }
}
