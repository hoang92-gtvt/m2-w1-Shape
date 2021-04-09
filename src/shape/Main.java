package shape;

public class Main {
    public static void main(String[] args) {
        Square hv1= new Square(10);
        double chuvi = hv1.getPrimeter();
        System.out.println(chuvi);

        hv1.setHeight(20);
        double chuvi2 = hv1.getPrimeter();
        System.out.println(chuvi2);

    }
}
