package geometria;

public class Trapezoid extends Shape {
    private double base1;
    private double base2;
    private double height;
    private double side1;
    private double side2;

    public Trapezoid(double base1, double base2, double height, double side1, double side2) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }
    @Override
    public double getPerimeter() {
        return base1 + base2 + side1 + side2;
    }

}
