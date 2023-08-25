package classwork.chapter3;

public class Promote {
    public static void main(String[] args) {
        byte b=55;
        char c='a';
        short s=1024;
        int i=53000;
        float f=5.34f;
        double d=.23777;
        double Result=(f*b)+(i/c)+(d*s);
        System.out.println((f*b)+"+"+(i/c)+"-"+(d*s));
        System.out.println("result "+ Result);
    }
}
