package classwork.chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x = 100, y = 200;
        if (x < y) {
            System.out.println("x is less then y");
            x = x * 2;
        }
        if (x == y) {
            System.out.println("x is equal to y");
            x = x * 2;
        }
        if (x > y) {
            System.out.println("x is greater than y");
        }
        if (x == y) {
            System.out.println("line wont work");
        }

    }
}
