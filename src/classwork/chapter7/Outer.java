package classwork.chapter7;

public class Outer {
    int oouterX=100;
    void test(){
        Inner inner=new Inner();
        inner.display();
    }
    class Inner {
        int y=10;
        void display(){
            System.out.println("вывод: outerX= "+oouterX);
        }
    }

}
