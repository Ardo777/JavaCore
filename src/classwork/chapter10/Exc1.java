package classwork.chapter10;

public class Exc1 {
    static  void subroutine(){
        int d=0;
        int a=10/d;
    }

    public static void main(String[] args) {
        try {
            Exc1.subroutine();
        }catch (ArithmeticException e){
            System.out.println("Деление на нуль");
        }
        System.out.println("после оператора catch");
    }
}
