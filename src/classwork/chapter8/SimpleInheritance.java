package classwork.chapter8;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superob = new A();
        B subob = new B();
        superob.i = 10;
        superob.j = 20;
        System.out.println("Содержимое обьекта superob: ");
        superob.showij();
        System.out.println();
        subob.i = 7;
        subob.j = 15;
        subob.k = 3;
        System.out.println("Содержимое обьекта subob: ");
        subob.showij();
        subob.showk();
        System.out.println();
        System.out.println("Сумма i,j и k в обьекте subob: ");
        subob.sum();
    }
}
