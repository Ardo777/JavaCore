package classwork.chapter8;

public class FindAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(7, 4);
        Triangle t = new Triangle(7, 2);
        Figure figref;
        figref = r;
        System.out.println("Площадь равна " + figref.area());
        figref = t;
        System.out.println("Площадь равна " + figref.area());
    }
}
