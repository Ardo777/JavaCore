package classwork.chapter7.Recursion;

public class recursion2 {
    public static void main(String[] args) {
        RecTest ob=new RecTest(10);
        int i;
        for ( i = 0; i < 10; i++) {
            ob.values[i]=i;


        }
        ob.printarray(10);
    }
}
