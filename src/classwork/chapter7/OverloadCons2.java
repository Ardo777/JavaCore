package classwork.chapter7;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box mycube = new Box(7);
        Box myClone = new Box(myBox1);
        double vol;
        vol = myBox1.volume();
        System.out.println("Обьем myBox1 равен " + vol);
        vol = myBox2.volume();
        System.out.println("Обьем myBox2 равен " + vol);
        vol = mycube.volume();
        System.out.println("Обьем куба равен " + vol);
        vol = myClone.volume();
        System.out.println("Обьем клона равен " + vol);

    }
}
