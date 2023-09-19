package classwork.chapter6;

public class BoxTest6 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        vol = myBox1.volume();
        System.out.println("Обьем равен " + vol);
        vol = myBox2.volume();
        System.out.println("Обьем равен " + vol);
    }
}
