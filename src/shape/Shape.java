package shape;

public class Shape {
    //thuoc tinh
    String name;


    //khoi tao
    public Shape(){};

    public Shape(String name) {
        this.name = name;
    }
    //getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //phuong thuc dac trung
    public double getPrimeter(){
        double primeter =0;
        return primeter;
    }

    public double getArea(){
        double area =0;
        return area ;
    }
}
