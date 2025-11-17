package geometria;

class Parallelogram extends Shape {
    private double base;
    private double height;

    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea() {
        return base * height;
    }
}
