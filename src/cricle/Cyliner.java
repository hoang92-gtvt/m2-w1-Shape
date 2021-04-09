package cricle;

public class Cyliner extends Circle {
    double height;

    public Cyliner(int radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getV(){
        return super.getArea()*this.height;
    }
}
