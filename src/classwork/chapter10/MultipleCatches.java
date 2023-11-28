package classwork.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a: " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации за приделами масива: "+e);
        }
        catch (ArithmeticException ex){
            System.out.println("Деление на нуль: "+ex);
        }
        System.out.println("После блоков try/catch");
    }

}
