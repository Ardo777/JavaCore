package classwork.chapter8;

public class A {
    int i, j;

    void showij() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + " " + j + " " + k));
    }
}
