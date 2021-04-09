package shape;

public class Rectangle extends Shape {

    private double width;
    private double height;

//Khởi tạo theo cách của phương thức con, phương thức char là mặc định không tham số;
    public Rectangle(double width, double height) {
        this.width =width;
        this.height=height;
    }

// khởi tạo theo phương thức con , phương thức char được khởi tạo theo cách có tham số name;
    public Rectangle(String name,double width, double height) {
        super(name);
        this.width =width;
        this.height=height;
    }


//phuong thuc get set


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    //phương thưc ghi dè
    public double getPrimeter(){
        double primeter =0;
        primeter += (this.width+this.height)*2;
        return primeter;

    }
    //phuong thức ghi chồng
    public double getPrimeter(double abc){
        double primeter =0;
        primeter += (this.width+this.height)*2 + abc;
        return primeter;
    }
    //phương thức khác của lớp child
    public double getPrimeter1(double abc){
        double primeter =0;
        primeter += (this.width+this.height)*2 + abc;
        return primeter;
    }

    public double getArea(){
        double area =0;
        area += this.height*this.width;
        return area ;
    }
}
