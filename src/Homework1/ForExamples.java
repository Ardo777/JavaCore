package Homework1;

public class ForExamples {
    public static void main(String[] args) {

        //Varjutyun #1

        for (int i = 1; i <= 999; i++) {
            System.out.print(i + "-");
            if (i == 999) System.out.print(1000);
        }
        System.out.println('\n');

        //Varjutyun #2

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) System.out.print(i + ",");
        }
        System.out.println('\n');

        //Varjutyun #3

        int[] array = {2, 65, 44, 1, 777, 234, 342, 34};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }


        }
        System.out.println(max);

    }
}

