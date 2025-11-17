package geometria;

class Deltoid extends Shape {
    private double d1;
    private double d2;

    public Deltoid(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
    @Override
    public double getArea() {
        return (d1 * d2) / 2;
    }
}

