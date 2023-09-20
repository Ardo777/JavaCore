package Homework.dynamicarray;

public class DynamicArrayMethod {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size] = value;
        ++size;

    }

    private void extend() {
        int[] newarray = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            newarray[i] = array[i];

        }
        array = newarray;

    }

    public int getByIndex(int index) {
        if (index <= size && index >= 0) {
            return array[index];
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }

}


