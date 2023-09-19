package classwork.chapter6.stack;

public class StackTest {
    public static void main(String[] args) {
        StackMethod myStack1 = new StackMethod();
        StackMethod myStack2 = new StackMethod();
        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int i = 10; i < 20; i++) myStack2.push(i);
        System.out.println("Содержимое стека myStack1:");

        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Содержимое стека myStack2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }


    }
}
