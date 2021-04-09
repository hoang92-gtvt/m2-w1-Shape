package cricle;

public class Circle {
    int radius;
    final double pi=3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPrimeter(){
        return this.radius*2*pi;
    }

    public double getArea(){
        return this.radius*this.radius*pi/4;
    }
}
