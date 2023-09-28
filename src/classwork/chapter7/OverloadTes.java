package classwork.chapter7;

public class OverloadTes {
    public static void main(String[] args) {
//        double result;
        int i = 88;
        OverloadMethod ovl = new OverloadMethod();
        ovl.test();
//        ovl.test(7);
        ovl.test(8, 5);
        ovl.test(i);
        ovl.test(7.7);

//        result=ovl.test(7.7);
//        System.out.println("Резултат вызова ovl.test(7.7)= "+result);
    }
}
