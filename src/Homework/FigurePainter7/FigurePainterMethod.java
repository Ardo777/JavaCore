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

    void figureTwo(int b, char k) {
        for (int i = b; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    void figureThree(int y,int b, char t) {

        for (int i = y; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");

            }
            for (int k = b; k >= i; k--) {
                System.out.print(t + " ");

            }
            System.out.println();


        }
    }

    void figureFour(int k, int o, char v) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");

            }
            for (int j = o; j > i; j--) {
                System.out.print(v+" ");

            }
            System.out.println();
        }
    }

    void figureFive(int y,char b) {
        for (int i = 0; i < y; i++) {
            for (int j = y; j > i; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print(b+" ");

            }
            System.out.println();
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

            }
            for (int j = y; j > i; j--) {
                System.out.print(b+" ");

            }
            System.out.println();

        }
    }
}
