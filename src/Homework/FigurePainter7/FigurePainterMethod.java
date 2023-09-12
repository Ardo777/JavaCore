package Homework.FigurePainter7;

public class FigurePainterMethod {
    void figureOne(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(c + " ");

            }
            System.out.println();
        }
    }

    void figureTwo(int b,char k) {
        for (int i = b; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    void figureThree() {
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
    }

    void figureFour() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    void figureFive() {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

            }
            for (int j = 4; j > i; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
