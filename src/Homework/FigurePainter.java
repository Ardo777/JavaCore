package Homework;

public class FigurePainter {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println('\n');
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println('\n');
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print('*');

            }
            System.out.println();


        }
        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 4; j >i; j--) {
                System.out.print("* ");
                
            }
            System.out.println();

        }
    }
}


