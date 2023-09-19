package classwork.chapter6;

public class BoxTest7 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 15, 10);
        Box myBox2 = new Box(3, 6, 9);
        double vol;
        vol = myBox1.volume();
        System.out.println("Обьем равен " + vol);
        vol = myBox2.volume();
        System.out.println("Обьем равен " + vol);
    }
}
