package classwork.chapter7;

public class CallByValue {
    public static void main(String[] args) {
        Test ob=new Test(15,20);
        System.out.println("o.a и o.b до вызова: "+ ob.a+" "+ob.b);
        ob.meth(ob);
        System.out.println("o.a и o.b после вызова: "+ ob.a+" "+ob.b);

    }
}
