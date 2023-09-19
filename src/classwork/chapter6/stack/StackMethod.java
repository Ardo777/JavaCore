package classwork.chapter6.stack;

import java.util.Stack;

public class StackMethod {     int stck[] = new int[10];
    int tos;
    StackMethod () {
        tos = -1;
    }
    void push ( int item){
        if (tos == 9)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;

    }
    int pop(){
        if (tos<0){
            System.out.println("Стек не загружен.");
            return 0;}
        else return stck[tos--];
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
