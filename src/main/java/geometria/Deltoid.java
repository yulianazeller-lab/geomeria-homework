package geometria;

public class Deltoid extends Shape {
    private double d1;
    private double d2;
    private double sideA, sideB;


    public Deltoid(double d1, double d2, double sideA, double sideB)
    {
        this.d1 = d1;
        this.d2 = d2;
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public double getArea()
    {
        return (d1 * d2) / 2;
    }
    @Override
    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }

}

