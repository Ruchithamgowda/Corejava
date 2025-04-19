abstract class Polygon {
    abstract int getSides();
    abstract double getArea();
    abstract double getPerimeter();
    abstract void draw();
    abstract void describe();
}

class Triangle extends Polygon {
    int getSides() { return 3; }
    double getArea() { return 0.5 * 5 * 6; }
    double getPerimeter() { return 5 + 6 + 7; }
    void draw() { System.out.println("Drawing a triangle."); }
    void describe() { System.out.println("A triangle has 3 sides."); }
}

class Square extends Polygon {
    int getSides() { return 4; }
    double getArea() { return 4 * 4; }
    double getPerimeter() { return 4 * 4; }
    void draw() { System.out.println("Drawing a square."); }
    void describe() { System.out.println("A square has 4 equal sides."); }
}
