package cricle;

public class Main {
    public static void main(String[] args) {
        Circle hinh1 = new Circle(10);
        Circle hinh2= new Cyliner(10,15);

        System.out.println(hinh1.getArea());
        System.out.println(hinh2.getArea());
        System.out.println(((Cyliner)hinh2).getV());//ép kiểu
    }
}
