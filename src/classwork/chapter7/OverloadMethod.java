package classwork.chapter7;

public class OverloadMethod {
    void test() {
        System.out.println("Параметри отсутсвуют");
    }
//    void test(int a) {
//        System.out.println("a= " + a);
//    }

    void test(int a, int b) {
        System.out.println("a= " + a + " " + "b= " + b);
    }

    void test(double a) {
        System.out.println("Внутренное преобразование при вызове " + "test(double ) a= " + a);

    }

}
