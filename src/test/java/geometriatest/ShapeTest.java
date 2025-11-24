package geometriatest;
import geometria.Circle;
import geometria.Deltoid;
import geometria.Parallelogram;
import geometria.Triangle;
import org.junit.jupiter.api.Test;

import geometria.Shape;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    @Test
    void testCirclePerimeter() {
        Shape circle = new Circle(5.0);
        double perimeter = ((Circle) circle).getPerimeter();
        assertEquals(2 * Math.PI * 5.0, perimeter, 0.0001);
    }
    @Test
    void testTrianglePerimeter() {
        Shape triangle = new Triangle(3, 4, 5);
        double perimeter = ((Triangle) triangle).getPerimeter();
        assertEquals(12.0, perimeter, 0.0001);
    }
    @Test
    void testParallelogramPerimeter() {
        Shape parallelogram = new Parallelogram(8, 5, 6);
        double perimeter = ((Parallelogram) parallelogram).getPerimeter();
        assertEquals(28.0, perimeter, 0.0001);
    }
    @Test
    void testDeltoidPerimeter() {
        Shape deltoid = new Deltoid(6, 9, 4, 5);
        double perimeter = ((Deltoid) deltoid).getPerimeter();
        assertEquals(18.0, perimeter, 0.0001);
    }
}
