package Homework;

public class ArrayUtil {
    public static void main(String[] args) {
        //1)
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {


            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");

        //2)
        System.out.print(numbers[0]);
        System.out.println("\n");

        //3
        System.out.print(numbers[numbers.length - 1]);

        System.out.println("\n");

        //4
        System.out.print(numbers.length);

        System.out.println("\n");

        //5
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }


        }
        System.out.print(min);

        System.out.println("\n");

        //6


        //7
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                b++;
            }
        }
        System.out.print(b);

        System.out.println("\n");

        //8
        int n = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                n++;
            }
        }
        System.out.print(numbers.length - n);

        System.out.println("\n");

        //9
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        System.out.print(sum);

        System.out.println("\n");

        //10
        double sum2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum2 = sum2 + numbers[i];

        }
        System.out.print(sum2 / numbers.length);

    }
}






