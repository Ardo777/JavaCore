package classwork.chapter8;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1=new BoxWeight(10,20,15,37.3);
        BoxWeight myBox2=new BoxWeight(2,3,4,0.76);
        double vol;
        vol=myBox1.volume();
        System.out.println("myBox1 vol= "+vol);
        System.out.println("myBox1 weight= "+ myBox1.weight);
        vol=myBox2.volume();
        System.out.println("myBox2 vol= "+vol);
        System.out.println("myBox2 weight= "+ myBox2.weight);
    }
    
}
