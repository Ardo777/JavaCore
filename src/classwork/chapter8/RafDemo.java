package classwork.chapter8;

public class RafDemo {
    public static void main(String[] args) {


        BoxWeight weightbox = new BoxWeight(3, 5, 7, 0.887);
        Box plainbox = new Box();
        double vol;
        vol = weightbox.volume();
        System.out.println("Обьем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("Обьем plainbox равен " + vol);


    }
}