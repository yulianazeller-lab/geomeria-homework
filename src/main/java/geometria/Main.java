package geometria;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape triangle = new Triangle(5.0, 3.0, 4.0);
        Shape trapezoid = new Trapezoid(5, 7, 3, 4,4);
        Shape parallelogram = new Parallelogram(9.0, 5.0,6.0);
        Shape deltoid = new Deltoid(6, 9,4,5);

        System.out.println("Площа круга: " + circle.getArea() + ", Периметр: " + circle.getPerimeter());
        System.out.println("Площа трикутника: " + triangle.getArea() + ", Периметр: " + triangle.getPerimeter());
        System.out.println("Площа трапеції: " + trapezoid.getArea() + ", Периметр: " + trapezoid.getPerimeter());
        System.out.println("Площа паралелограма: " + parallelogram.getArea() + ", Периметр: " + parallelogram.getPerimeter());
        System.out.println("Площа дельтоїда: " + deltoid.getArea() + ", Периметр: " + deltoid.getPerimeter());
    }

}
