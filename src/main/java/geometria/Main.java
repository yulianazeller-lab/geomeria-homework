package geometria;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        Shape triangle = new Triangle(5, 3);
        Shape trapezoid = new Trapezoid(5, 7, 3);
        Shape parallelogram = new Parallelogram(9, 5);
        Shape deltoid = new Deltoid(5, 8);

        System.out.println("Площа круга: " + circle.getArea());
        System.out.println("Площа трикутника: " + triangle.getArea());
        System.out.println("Площа трапеції: " + trapezoid.getArea());
        System.out.println("Площа паралелограма: " + parallelogram.getArea());
        System.out.println("Площа дельтоїда: " + deltoid.getArea());
    }

}
