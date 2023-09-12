package classwork.chapter6;

public class BoxTest4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        myBox1.widht = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.widht = 3;
        myBox2.height = 6;
        myBox2.depth = 9;
        vol=myBox1.volume();
        System.out.println("Обьем равен "+vol);
        vol= myBox2.volume();
        System.out.println("Обьем равен "+vol);

    }
}
