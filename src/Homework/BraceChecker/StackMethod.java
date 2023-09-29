package Homework.BraceChecker;

import java.util.Stack;

public class StackMethod {
    int stck[] = new int[10];
    private int tos;


    StackMethod() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;

    }

    int pop() {
        if (tos < 0) {
//            System.out.println("Стек не загружен.");
            return 0;
        } else return stck[tos--];
    }

    private void extend() {
        int newstck[] = new int[stck.length + 10];
        System.arraycopy(stck, 0, newstck, 0, tos);
        stck = newstck;
    }

    public int getSize() {
        return tos;
    }
}
//    int[] array = new int[10];
//    int index;
//
//    StackMethod () {
//        index = -1;
//    }
//    void push(int item){
//        array[++index]=item;
//    }
//
//    int pop(){
//        return array[index--];
//    }
//}
